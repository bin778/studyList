// 조건부 타입
interface Bank {
  financialCode: string;
  companyName: string;
  name: string;
  fullName: string;
}

interface Card {
  financialCode: string;
  companyName: string;
  name: string;
  appCardType?: string;
}

type PayMethod<T> = T extends "card" ? Card : Bank;
type CardPayMethodType = PayMethod<"card">;
type BankPayMethod = PayMethod<"bank">;

// 조건부 타입을 사용하지 않으면 안정성과 유연성이 떨어진다.
interface PayMethodBaseFromRes {
  financialCode: string;
  name: string;
}

interface Bank extends PayMethodBaseFromRes {
fullName: string;
}

interface Card extends PayMethodBaseFromRes {
appCardType?: string;
}

type PayMethodInfo<T extends Bank | Card> = T & PayMethodInterface;
type PayMethodInterface = {
companyName: string;
// ...
}

// extends 조건부 타입을 활용하여 개선하기
type PayMethodType<T extends "card"|"appcard"|"bank"> = T extends 
  | "card"
  | "appcard"
  ? Card
  : Bank;

export const useGetRegisteredList = <T extneds "card"|"appcard"|"bank">(
  	type: T
 ): UseQueryResult<PayMethodType<T>[]> => {
  	const url = `baeminpay/codes/${type === "appcard" ? "card" : type}`;
  
	const fetcher = fetcherFactory<PayMethodType<T>[]>({
  		onSuccess: (res) => {
  			const usablePocketList = 
  				res?.filter(
  					(pocket: PocketInfo<Card> | PocketInfo<Bank>) => 
 						pocket?.useType === "USER"
  				) ?? [];
  			return usablePocketList;
  		},
  	});
  
  	const result = useCommonQuery<PayMethodType<T>[]>(url, undefined, fetcher);
  	
  	return result;
};

// infer를 활용한 조건부 타입
type UnpackPromise<T> = T extends Promise<infer K>[] ? K : any;
const promises = [Promise.resolve("Mark"), Promise.resolve(38)];
type Expected = UnpackPromise<typeof promises>; // string | number
