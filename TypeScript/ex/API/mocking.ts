// JSON 파일 불러오기
// mock/service.ts
const SERVICES: Service[] = [
  {
    id: 0,
    name: "배달의민족",
  },
  {
    id: 1,
    name: "만화경",
  },
];

export default SERVICES;

// api.ts
const getServices = ApiRequester.get("/mock/service.ts");

// NextApiHandler 활용하기
// api/mock/brand
import { NextApiHandler } from "next";

const BRANDS: Brand[] = [
  {
    id: 1,
    label: "배민스토어",
  },
  {
    id: 2,
    label: "비마트",
  },
];

const handler: NextApiHandler = (req, res) => {
  // request 유효성 검증
  res.json(BRANDS);
};

export default handler;

// API 요청 핸들러에 분기 추가하기
const mockFetchBrands = (): Promise<FetchBrandsResponse> =>
  new Promise((resolve) => {
    setTimeout(() => {
      resolve({
        status: "SUCCESS",
        message: null,
        data: [
          {
            id: 1,
            label: "배민스토어",
          },
          {
            id: 2,
            label: "비마트",
          },
        ],
      });
    }, 500);
  });

const fetchBrands = () => {
  if (useMock) {
    return mockFetchBrands();
  }

  return requester.get("/brands");
};
