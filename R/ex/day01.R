3+7
# 5+8
# 더하기를 했다.

# 안녕하세요
# 여러줄을
# 주석하고 싶어요

print(10+2)

print('홍길동')

"홍길동"

TRUE

class("10")
class(10)
class(TRUE)


# 숫자 + 숫자 -> 숫자
10 + 7

# 숫자 + 문자 -> 오류
10 + 'hi'

# 숫자 + 논리 -> 숫자
# TRUE : 1, FALSE : 0
10 + TRUE
10 + FALSE

'hi' + TRUE

TRUE + TRUE

# 문자는 연산이 불가능하다.
'안녕' + '하세요'


10 / 3
# 몫 연산자
10 %/% 3

# 나머지 연산자
10 %% 3

# 지수 연산자
2 ^ 3

# 0으로 나누었을 경우
# Inf -> 무한을 나타내는 값
10 / 0

19237*25
a <- 22
a + 10

num <- 10
num2 <- num + 10

# 변수는 값을 변경할 수 있다.
num <- 30

num
class(num)

num12312421 <- 10
num.wer <- 10
Num <- 10
num <- 10

user.age <- 30

철수_나이 <- 30

rm(num)
remove(num12312421)

T
F

#---------------------------------------------------

# c()
nums <- c(1,2,3,4,5)

c(1,2,-3, 3.14)
nums

# seq()
# 규칙성이 있는 값을 벡터를 만들 때 seq()를 사용한다.
seq(1,100)

# 함수를 사용할 때 ()안에 넘겨주는 값을 
# 인수, 인자, argument라고 한다.
# 매개변수, parameter라고 한다.
# 일반적으로 값을 넘겨주면 함수를 만든 사람이
# 정해놓은 순서대로 값을 넘겨주게 된다.
seq(10,20,2)

# 함수를 사용하여 값을 넘겨 줄 때 매개변수의 이름을 직접 명시하여 설정해 줄 수 있다.
# '옵션을 설정한다'라고 생각하면 된다.

seq(from = 10, to = 20, by=2)
seq(to=10)
# seq()에서 사용하는 매개변수
# from : 시작값
# to : 끝값
# by : 증감값

seq(10, 1, -1)
# 이러한 옵션이나 설명은 f1을 눌러 확인하거나 구글에서 검색하여 찾아봐야 한다.

# 콜론 연산자(:)
1:10
10:1
test <- 1:10
test

nums <- c(10, -4, 3.14, 20, -5.7)

nums

# 특정 값만 가져오는 경우 값들에 부여된 인덱스번호로 가져온다.
# index는 1부터 시작한다.
nums[4]

nums[2, 4]

# number <- c(1,2,3,4,5)

nums[c(2,3,4)]

nums[2:4]

test

# [실습]
# test 벡터에서 2, 4, 6, 8번 데이터 가져오기
test
test[c(2,4,6,8)]
test[seq(2,8,2)]

# 위의 결과에서 6만 뽑기
test[seq(2,8,2)][3]

num1 <- 30
num1
test[4] <- 100
test
test[5:8] <- 0
test

test[5:8] <- -1:-4
test
test[c(2,4)] <- c(10, 20)
test



# 벡터의 연산
v1 <- seq(10, 60, 10)

v1
v1 + 5
v1 + c(10, 20, 30)
vi + c(10, 20, 30, 40)

# 큰 벡터가 작은 벡터의 길이가 나누어 떨어져야 경고가 발생하지 않는다.

days <- c('월', '화', '수', '목', '금', '토', '일')
days[seq(1,7,2)]

c(T,F,T,T)

days[c(F,F,T)]

days

c(1,F)

c(1, "안녕", T)


ages <- c(50,25,12,31,45)

ages

# names(벡터)
names(ages) <- c('길동', '영희', '철수', '유리', '짱구')

names(ages)[3] <- '옹이'

ages
ages + 5
ages['유리'] + 3

names(ages)[3] <- '수현'
ages
ages[c('영희','유리')]

test <- c(1,2,3,4,5)

# 벡터에 칼럼명을 숫자로 저장할 수 없다.
# 자동으로 문자로 바뀐다.
names(test) <- c(10,20,30,40,50)

names(test)
test[30]
test['30']

ages

names(ages)[5] <- '유리'
ages

ages['유리']

# 비교 연산자
10 > 5
num <- 10
num2 <- 20

num > num2

'a' == 'a'
'a' != 'a'

# 논리 연산자
T & T
T & F
F & F

T | T
T | F
F | F

!T
!F
# 논리연산자 실사용 예시
10 > 5 & 30 > 22 
isTrue <- 10 > 20 & 2 <=2 | 1==1

ages
ages[c(F,T,F,F,T)]

# 나이가 짝수인 값만 뽑기(예시)
ages %% 2

ages %% 2 == 0

ages[ages %% 2 == 0]

# [실습]
nums <- c(-7, 10, -11, -4, 73, 15, 22)

# nums에서 짝수이고 양수인 값만 뽑기
nums %% 2 == 0
num > 0

nums[nums %% 2 == 0]
nums[nums > 0]

nums[nums %% 2 == 0 & nums > 0]

c(T, T, F, F) & c(T, F, T, F)
c(T, T, F, F) && c(T, F, T, F)
c(T, T, F, F) || c(T, F, T, F)
