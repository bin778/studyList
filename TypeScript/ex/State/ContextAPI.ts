type Consumer<C> = () => C;
export interface ContextInterface<S> {
  state: S;
}

export function createContext<S, C = ContextInterface<S>>(): readonly [React.FC<C>, Consumer<C>] {
  const context = React.createContext<Nullable<C>>(null);
  
  const Provider: React.FC<C> = ({ children, ...otherProps }) => {
    return (
      <context.Provider value={otherProps as C}>
        {children}
      </context.Provider>
    );
  };

  const useContext: Consumer<C> = () => {
    const _context = React.useContext(context);
    if(!_context) {
      throw new Error(ErrorMessage.NOT_FOUND_CONTEXT);
    }
    return _context;
  };
  
  return [Provider, useContext];
}

interface StateInterface {}
const [context, useContext] = createContext<StateInterface>();

// 위와 같이 사용하면 컨텍스트를 구독하는 컴포넌트에서 앱에 정의된 상태를 읽고 업데이트 할 수 있다.
// 하지만 대규모 애플리케이션이나 성능이 중요한 애플리케이션에서 권장되지 않는 방법이다.
// 그 이유는 Context Provider의 props로 주입된 값이나 참조가 변경될 때마다 해당 Context를 구독하고 있는 모든 컴포넌트가 리렌더링 되기 때문이다.
function App() {
  const [stae, dispatch] = useReducer(reducer, initialState);
  
  return (
    <StateProvider.Provider value={{state, dispatch}}>
      <ComponentA />
      <ComponentB />
    </StateProvider.Provider>
  }
}
