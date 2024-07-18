* Tailwind CSS는 마크업에 직접적으로 모든 디자인을 구축할 수 있는 클래스들로 구성된 유틸리티 우선 CSS 프레임워크이다.
* 사전에 정의되어 있는 여러 CSS 유틸리티 클래스들(ex. justify-content: space-between; → justify-between)을 활용해 스타일링할 수 있도록 제공하는 프레임워크이다.
* Tailwind CSS는 여러 CSS 유틸리티 클래스를 제공하기 때문에 공식 문서에서 표준화된 유틸리티 클래스를 사용하면 된다.

# Tailwind CSS 장점
* 컨텍스트 스위칭 감소: Tailwind CSS는 마크업 파일에 스타일을 작성하는 방식이기 때문에, 마크업 파일에만 집중할 수 있다.
* 네이밍 고민 X: Tailwind CSS는 표준화된 유틸리티 클래스를 지원하기 때문에 스타일에 대한 네이밍을 고민해도 되지 않아 그저 스타일을 작성하면 된다.
* 유연성: Tainwind CSS는 표준화된 유틸리티 클래스를 사용하거나 직접 추가한 사용자 지정 디자인을 사용할 수 있어 프로젝트 요구 사항에 맞는 디자인을 만들 수 있다.
* 접근성: Tainwind CSS는 색상 대비 및 화면 판독기 지원과 같은 액세스 가능한 디자인 기능을 지원한다.

# Tailwind CSS 장점
* 진입 장벽: Tailwind CSS에는 기존 CSS 프레임워크에 익숙한 개발자가 배우기 어려울 수 있는 스타일 지정에 대한 고유한 구문과 접근 방식이 있어 처음에는 개발 속도가 느려지고 마스터하는 데 시간이 오래 걸린다.
* 빌드 과정: Tailwind CSS는 자동으로 빌드하는 기능을 지원하기 때문에 사용자가 직접 빌드를 해야 하는 번거로움이 있다.
* 비대해지는 파일: Tailwind CSS는 유틸리티 기반이므로 특히 사용 가능한 클래스를 많이 사용하는 경우 CSS 파일 크기가 커질 수 있어 페이지 로드 시간이나 성능이 저하될 수 있다.
* 제한된 디자인 제어: Tailwind CSS는 많은 유틸리티 클래스를 제공하지만 제공하지 않는 디자인은 사용자가 직접 디자인을 만들어야 한다.
* 가독성: Tailwind CSS는 코드 가독성이 저하되고 중복 코드가 증가하는 문제가 발생할 수 있어 유지보수할 때 어려움으로 이어질 수 있다.

# Tailwind CSS와 함께 쓰면 좋은 것들
### Editor
* Tailwind CSS IntelliSense(VS Code, WebStorm): Tailwind CSS는 공식적으로 에디터 플러그인을 제공한다. 자동완성, 프리뷰(Tailwind CSS 클래스명을 호버하면 실제 CSS 코드를 보여줌), 린트 등의 편리한 기능이 있으니 에디터를 사용하는 것이 좋다.
* Inline fold(VS Code): 마크업에 집중하고 싶을 때, 길게 늘어진 클래스명을 접어서 가독성을 향상시켜주는 플러그인이다.

### Prettier
* prettier-plugin-tailwindcss: 클래스명을 정렬해주는 Prettier 플러그인이며 순서에 익숙해지면 가독성이 크게 향상되는 효과를 볼 수 있다.

### Other
* clsx: React className에서의 조건부 스타일링을 덜 복잡하고, 구조화된 방식으로 작성할 수 있는 유틸 함수이다.
* Headless UI: Tailwind 팀에서 개발한 Headless UI 컴포넌트이며, Tailwind CSS와의 궁합이 좋고 공식 홈페이지의 예제 또한 Tailwind CSS 기반이여서 편리하다.