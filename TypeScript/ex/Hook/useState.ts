import { useState } from "react";

// memberList의 타입 선언
interface Member {
  name: string;
  age: number;
}

const MemberList = () => {
  const [memberList, setMemberList] = useState<Member[]>([]); // 타입 지정

  // member의 타입이 Member 타입으로 보장됨
  const sumAge = memberList.reduce((sum, member) => sum + member.age, 0);

  const addMember = () => {
    setMemberList([
      ...memberList,
      {
        name: "DokgoBaedal",
        agee: 11,
      },
    ]);
  };
  // (X) Type 'Member | { name: string; agee: number; }' is not assignable to type 'Member'.

  return ( /* ... */ );
};
