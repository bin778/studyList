scores <- read.table("F:/1400_R_choilb/resource/score.txt",sep=',',header=T)

# [실습]

# 학생들의 수학 평균점수를 구한다.
mean(scores$math)
# 홍길동의 모든 과목들의 점수를 구한다.
scores[scores$name == '홍길동',]
# 학생들의 국어 점수 총합 구한다.
sum(scores$kor)

# 제어문자
# 문자 안에서 특수한 기능을 하는 문자
# \" : 쌍따옴표
# \\ : 역슬래시

str <- '나는 \'안녕하세요\' 라고 말했다.'
str

str2 <- '제어 문자는 \\로 시작한다.'
str2

# grep(pattern, x): 결과는 벡터

# pattern : 찾고 싶은 패턴
# x : 문자 벡터(데이터)
fruit <- c('apple','banana','Apple','grape','pineapple')

grep('apple',fruit)

grep('apple', fruits, ignore.case= T) # ignore.case 대문자 구분 여부

fruit[grep('apple',fruits ,ignore.case = T)]
fruit[c(1,3,5)]

fruit <- c(fruit, 12345, 567, 83, 2)
fruit


# 정규표현식
# a로 시작하는 값 ^
grep('^a', fruit)
grep('^a', fruit ,ignore.case = T)

# e로 끝나는 값 &
grep('e$', fruit)


# 숫자가 들어있는 문자 값 \d
grep('\\d', fruit)

# 문자는 \D
grep('\\D', fruit)

# 한글자 이상 (모든 값) . -> 6글자 이상은 ......
grep('.', fruits)
grep('......',fruit)

strrep('.', 30)
grep(strrep('.',6), fruit)


movie_review <- readLines('F:/1400_R_choilb/resource/movie.txt')

grep(strrep('.',30),movie_review)
movie_review[grep(strrep('.',30), movie_review)]

grep('DC', movie_review, ignore.case=T)

# 리뷰가 30글자 이상이고 DC가 포함된 리뷰를 찾기

# intersect(a,b) : a와 b와 교집합
# union(a,b) : a와 b의 합집합
# setdiff(a,b) : a - b 합집합

intersect(c(1,3,4,5),c(1,5,7,9))

result <- intersect(
  grep(strrep('.',30),movie_review),
  grep('DC', movie_review, ignore.case=T)
)

movie_review[result]

View()
str(scores)
head(scores, 2)

# dplyr
# 설치하기
# install.packages() : 패키지 다운로드 함수
# 설치는 한번만 하면된다.
install.packages('dplyr')

# library() : 패키지 부착
library(dplyr)

# 기존의 이름 변경 함수
names(scores)[1] <- 'name1'
scores

# rename() : dplyr에서 제공하는 이름 변경함수 -> 순서 주의하기!!!
# rename(데이터프레임, '새컬럼명' = '기존컬럼명')

scores <- rename (
  scores,
  'a' = 'name1',
  'b' = 'kor',
  'c' = 'eng',
  'd' = 'math'
)

scores

# 행 걸러내기
# filter(데이터프레임, 조건)
# 수학 점수가 70점이상인 학생만 골라내기
filter(scores, d>=70)

# 열 걸러내기
# 국어 점수, 수학 점수만 가져오기
# select(데이터프레임, 컬럼, 컬럼,......)
select(scores, b, d)

# 수학점수가 70점 이상이고 영어점수가 30점 이상인 학생들의 이름, 수학, 영어 점수 가져오기
filter(scores, math>=70 & eng>=30)

select(
  filter(scores, math>=70 & eng>=30),
  name, eng, math
)

a <- filter(scores,math>=70 & eng<=30)

select(a,name,eng,math)

#dplyr에서 지원하는 파이프 연산자
# %>% : 파이프 연산자
# ctrl + shift + m

scores %>% filter(math>=70)

scores %>% filter (math>=70) %>% 
  filter(eng>=30) %>%
  select(name,eng,math) %>% 
  View()

  
result_scores <- scores %>% filter (math>=70) %>% 
  filter(eng>=30) %>%
  select(name,eng,math)

result_scores %>% View()

# -----------------------------------------------------
lotto <- read.table('F:/1400_R_choilb/resource/lotto.csv',sep=',',header=T,skip=2)

lotto %>% View()

lotto %>% names()

# 어차피 필요한 데이터는
# 1. 2등 당첨금액 까지의 데이터 : 4~7열
# 2. 당첨 번호의 데이터 : 뒤에서부터 7개 열

lotto[,4:7] %>% head()

lotto1 <- lotto[,4:7]
lotto %>% str()

lotto2 <- lotto[,-(1:13)]

result <- cbind(lotto1, lotto2)

result %>% View()

result %>% names()

names(result) <- c(
  '1등 당첨자수',
  '1등 당첨금액',
  '2등 당첨자수',
  '2등 당첨금액',
  '1번',
  '2번',
  '3번',
  '4번',
  '5번',
  '6번',
  '보너스'
)

result %>% head()

# 역대 1등 당첨 금액중 가장 높은 금액 찾기

result$`1등 당첨자수`

result$`1등 당첨금액` %>% max()

result %>% str()

# 문자를 숫자로 어떻게 바꿀지 생각한다.
# 1. 우선 마지막에 붙은 '원'을 제거
money1 <- gsub('.{1}$','',result$`1등 당첨금액`)

# 2. 쉼표를 제거
money_result <- gsub(',','',money1)

money_result

# 3. 문자 타입을 숫자 타입으로 변환
as.numeric(money_result) %>% max()

result$`1등 당첨금액`<-as.numeric(money_result)

result %>% head()

result$`1번` %>% View()

table(c(1,2,3,4,1,2,3,4,1,1,1,1,1,1,1))  

count(result, '1번')

# 두 데이터 프레임을 합치기
t1 <- data.frame(result$`1번`)
t2 <- data.frame(result$`2번`)

names(t1) <- 'n'
names(t2) <- 'n'
rbind(t1,t2) %>% table()

install.packages('tidyverse') # tidyr을 포함한다.
library(tidyr)


# gather()
# 여러 컬럼을 하나의 컬럼으로 합쳐줌
# data : 넘겨줄 데이터
# key : 하나의 칼럼으로 합쳐줄 때 사용할 새 칼럼명
# value : 합쳐야 하는 칼럼들을 알려준다.
# value = '칼럼명','합칠 칼럼명', .....
# 합칠 칼럼명을 각각 명시할 때는 작은 따옴표가 아니라 백틱을 사용해야 한다.

result %>% gather(
  key = 'numbers',
  value = 'num_count', '1번':'보너스'
) %>% count(num_count, sort=T)

df_temp <- data.frame(
  kor = c(10,20,30),
  eng = c(20,50,70),
  math = c(80,70,60)
)

df_temp$kor + df_temp$eng + df_temp$math

# 1. 새로 만든다.
# 기존의 데이터 프레임과, 새로운 파생변수를 집접 넣어서 새로운 데이터 프레임을 만든다.
df_temp <- data.frame(
  df_temp,
  total = df_temp$kor + df_temp$eng + df_temp$math
)

df_temp

# 2. 기존의 데이터 프레임에 추가 한다.

v1 <- c(1,2,3)
v1[4] <- 10
v1

df_temp$total <- df_temp$kor + df_temp$eng + df_temp$math

df_temp

# dplyr을 통해 파생변수 만들기

df_scores <- read.csv('F:/1400_R_choilb/resource/student_score.csv',na.strings = '')

df_scores %>% View()

# mutate()

df_scores <- df_scores %>% mutate(
  total = kor + eng + math
)

# names(v1) <- c('v1','v2')


# df_scores에 각 학생들의 평균을 저장하는 컬럼을 avg을 만들어서 저장하기
df_scores <- df_scores %>% mutate(
  avg = total/3
)

df_scores %>% head(10)

# ifelse(조건, 참일 때 값, 거짓일 때 값)
# 조건의 결과는 항상 참, 거짓이 와야한다.
# 그러므로 비교연산자, 논리연산자 처럼 결과가 T,F인 명령어를 사용한다.

v2 <- 1:50

v2

ifelse(v2>25,1,0)

# v2에서 40이상이면 상, 30이상 40미만이면 중, 나머지는 하
ifelse(
  v2 >= 40, '상',
  ifelse(v2 >= 30, '중', '하')
)

# df_scores에 grade라는 컬럼을 만들어서,
# 전교생 평균의 상위 25%는 A, 상위 50%는 B

# 참고
# 전체 평균점수의 125% 이상은 A,
# 100%이상 125%미만은 B,
# 75%이상 100%미만은 C, 나머지는 D

df_scores <- df_scores %>% mutate(
  grade = ifelse(avg >= mean(avg)*1.25, 'A',
                 ifelse(avg >= mean(avg), 'B',
                      ifelse(avg>=mean(avg)*0.75,'C','D')
                      )
                 )
)

df_scores