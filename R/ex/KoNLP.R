# 형태소 분석
# 명사, 조사, 형용사 같은 품사들을 분석한다.
# 한국어를 분석하기 위해 거쳐야하는 과정이며 문장들을 가장 작은 단위로 나누어준다.

# 각 품사를 나누어 분석에 용이하게 만드는 과정이다.
# KoNLP 패키지
# 자바를 기반으로 만들어져 있기 때문에 자바가 설치되어야 한다.

# windows 환경에서 패키지를 안정적으로 실행시켜주는
# 프로그램인 R Tools를 설치한다.
# rJava 패키지 : R에서 자바를 활용할 수 있도록 만들어주는 패키지
install.packages('rJava')
install.packages('multilinguer')

library(rJava)
library(multilinguer)
library(wordcloud2)

# 결과가 0이면 정상적으로 사용 가능
rJava::.jinit()

# 의존성 패키지 설치(KoNLP를 사용하는데에 필요한 패키지)
install.packages(c("hash", "tau", "Sejong", "RSQLite", "devtools", "bit", "rex", "lazyeval", "htmlwidgets", "crosstalk", "promises", "later", "sessioninfo", "xopen", "bit64", "blob", "DBI", "memoise", "plogr", "covr", "DT", "rcmdcheck", "rversions"), type = "binary")

# github 원격 패키지
install.packages("remotes")

# github에서 KoNLP 설치
remotes::install_github('haven-jeon/KoNLP', upgrade = "never", INSTALL_opts = c("--no-multiarch"), force = TRUE)

.libPaths()
library(dplyr)
library(KoNLP)

# 설치 후 확인하기
extractNoun("R은 왜 패키지를 이렇게 설치해야 하는가?")

# 우리나라 단어가 저장된 사전을 설정(니아사전)
# ALL로 설치하기
useNIADic()

# 데이터 읽어오기
v_movie <- readLines('F:/1400_R_choilb/resource/sample1/movie.txt')

v_movie


# extractNoun()
# 명사를 추출해주는 함수: 결과는 리스트이다.
v_movie %>% extractNoun()

# unlist(): 데이터를 벡터로 변경해주는 함수: 단어들의 빈도수 측정
v_res <- v_movie %>% extractNoun() %>% unlist() %>% table()

v_res

# 데이터 프레임으로 변경하기
df_res1 <- data.frame(v_res)

df_res1 %>% head()

# 칼럼 이름 변경하기
names(df_res1)[1] <-'Var1'

# 문자 타입의 값을 가진경우 데이터 프레임으로 변경시 factor로 저장되는 경우가 있다.
df_res1$Var1 %>% levels()

df_res1$Var1 <- as.vector(df_res1$Var1)

# 한글자는 분석 의미가 없는 경우가 많으므로 제외시킨다.
# filter() : 행 거르기
# nchar() : 문자의 글자 수를 알려주는 함수(단, factor는 불가능)
df_res1 <- df_res1 %>% filter(nchar(Var1)>1)

library(wordcloud)

wordcloud(
  words = df_res1$Var1,
  freq = df_res1$Freq,
  min.freq = 1
)

df_res1 %>% wordcloud2(
  backgroundColor = 'black',
  color = 'random-light'
)

v_list <- df_scores %>% extractNoun() %>% unlist() %>% table()

df_list <- v_list %>% as.data.frame(stringAsFactors = F)

df_list %>% head()
df_list %>% wordcloud2(
  backgroundColor = 'black',
  color = 'random-light',
  shape = 'cardioid'
)

df_america <- readLines('F:/1400_R_choilb/resource/sample3/america.txt')

df_america <- gsub('[[:punct:]]','',df_america)

df_america

v_america <- df_america %>% extractNoun() %>% unlist() %>% table()

df_america <- data.frame(v_america)
df_america %>% head()
names(df_america)[1] <- 'Var1'

df_america$Var1 %>% levels()

df_america$Var1 <- as.vector(df_america$Var1)

df_america <- df_america %>% filter(nchar(Var1) > 1) %>% filter(Var1 != '있습니')

df_america %>% wordcloud2()

df_america %>% wordcloud2(
  backgroundColor = 'black',
  color = 'gold',
  shape = 'star'
)

install.packages('rvest')
library(rvest)

# 네이버 메인 화면 읽기
naver <- read_html('https://www.naver.com/')

naver %>% as.character() %>% writeLines('naver_test.html')

naver %>% str()

c(1:3) %>% class()
'a' %>% class()
naver %>% class()

# 반정형 데이터 HTML 파일에서 내가 원하는 태그를 선택하기(데이터 찾기)
# id: #
# class: .

# ex)
# <p>23</p>
# <p id='name'>홍길동</p>
# <p class='user'>김철수</p>
# <p class='user'>이유리</p>

# p태그 선택: 23, 홍길동, 김철수, 이유리
# #name 선택: 홍길동
# .user 선택: 김철수, 이유리

# html_node(): 원하는 태그를 선택하는 함수
# html_text(): 원하는 태그에서 텍스트르르 가져오는 함수
naver %>% html_node('.login_msg') %>% html_text()

# 데이터 읽어오기
url <- 'https://movie.naver.com/movie/sdb/rank/rmovie.naver'
movie_html <- read_html(url)
movie_html %>% as.character() %>% writeLines('movie_test.html')

# 랭킹 데이터 가져오기
movie_html %>% html_nodes('.ac>img:not(.arrow)') %>% html_attr('alt')

# 랭킹 데이터가 비어있는 데이터를 확인함
# 랭킹은 1~50까지니까 그냥 만들자
rank <- 1:50

# 영화 이름 데이터 가져오기
m_name <- movie_html %>% html_nodes('.tit3>a') %>% html_text()

df_mv <- data.frame('rank' = rank, 'movie_name' = m_name)
df_mv %>% View()

# 사람인 신입 IT채용 url 저장
url <- 'https://www.saramin.co.kr/zf_user/jobs/public/list/page/1?up_cd%5B0%5D=3&sort=ud&listType=public&public_list_flag=y&up_cd_list%5B0%5D%5B0%5D=301&up_cd_list%5B0%5D%5B1%5D=302&up_cd_list%5B0%5D%5B2%5D=303&up_cd_list%5B0%5D%5B3%5D=304&up_cd_list%5B0%5D%5B4%5D=305&up_cd_list%5B0%5D%5B5%5D=306&up_cd_list%5B0%5D%5B6%5D=307&up_cd_list%5B0%5D%5B7%5D=308&up_cd_list%5B0%5D%5B8%5D=309#searchTitle'

in_html <- read_html(url)

in_html %>% as.character() %>% writeLines('in_test.html')

# 공고 제목만 가져오기
in_name <- in_html %>% html_nodes('div.job_tit a.str_tit') %>% html_nodes('span') %>% html_text()

in_name %>% extractNoun() %>% unlist() %>% table() %>% wordcloud2()

# 페이지 별로 데이터를 뽑기 위해서 반복문을 사용하자
for(i in 1:20) {
  print(i)
}

for(i in 1:20) {
  print(paste('가', '나', sep = as.character(i)))
}

url1 <- 'https://www.saramin.co.kr/zf_user/jobs/public/list/page/'

url2 <- '?up_cd%5B0%5D=3&sort=ud&listType=public&public_list_flag=y&up_cd_list%5B0%5D%5B0%5D=301&up_cd_list%5B0%5D%5B1%5D=302&up_cd_list%5B0%5D%5B2%5D=303&up_cd_list%5B0%5D%5B3%5D=304&up_cd_list%5B0%5D%5B4%5D=305&up_cd_list%5B0%5D%5B5%5D=306&up_cd_list%5B0%5D%5B6%5D=307&up_cd_list%5B0%5D%5B7%5D=308&up_cd_list%5B0%5D%5B8%5D=309#searchTitle'


for(i in 1:10) {
  url[i] <- paste(url, url2, sep = as.character(i))
}

# 모든 페이지의 제목 결과를 저장할 벡터를 미리 만들어줌
v_name <- c()

for(i in 1:10) {
  in_html <- read_html(url[i])
  
  in_name <- in_html %>% html_nodes('div.job_tit a.str_tit') %>% html_node('span') %>% html_text()
  
  # append(벡터, 추가할 데이터)
  v_name <- append(v_name, in_name)
}

# 확인
v_name %>% extractNoun() %>% unlist() %>% table() %>% wordcloud2()

res_name <- v_name %>% extractNoun() %>% unlist()

# 2글자 이상만 뽑아오기
res_name <- res_name[grep('..', res_name)]

# 시각화
res_name %>% table() %>% wordcloud2(
  shape = 'star',
  backgroundColor = 'black',
  color = 'random-light'
)

# 머신러닝
df_tv <- read.csv('F:/1400_R_choilb/resource/sample3/tv_ad.csv')

df_tv %>% head()

# 결측치 제외
df_tv <- df_tv %>% filter(!is.na(df_tv$sales))

# 독립변수: tv 광고량
# 종속변수: 판매량

plot(df_tv$tv, df_tv$sales)

# cor(변수, 변수): 상관관계를 알려주는 함수
cor(df_tv$tv, df_tv$sales)

# lm(): 선형회귀 분석 함수 (linear model)
# formula : 종속변수와 독립변수를 설정하는 파라미터
# formula = 종속변수 ~ 독립변수
lm_tv <- lm(formula = sales ~ tv, data = df_tv)

lm_tv

# summary() : 자세한 분석 결과를 확인하는 함수
summary(lm_tv)

# 절편: 26.5632, 기울기: 7.3245
# 종속변수 = 절편 + 계수 * 독립변수
# 판매량 = 26.5632 + 7.3245 * tv광고량
# p값: 해당 모델을 벗어난 수치가 나올 가능성
# (오류[우연]일 가능성) -> 통계상 p값이 0.05이하일 경우 유의미하다고 판단
# Adjusted R-squared: 독립변수가 종속변수를 얼마나 잘 설명하는가? -> 예측 정확성

# 분석 결과 위와 같은 1차 함수가 성립된다.
# 모델을 만든것이다.

# 회기선을 그려보자
abline(lm_tv)


# data(): R에 내장된 연습용 data set을 확인
data()

du_mtcars <- mtcars
du_mtcars %>% str()

# 상관관계 확인하기
# 상관행렬: 상관계수들이 들어있는 행렬
cor(du_mtcars)

# round(데이터, 자리수): 반올림 함수
du_mtcars %>% cor() %>% round(3)

# corrplot 패키지
install.packages('corrplot')
library(corrplot)

du_mtcars %>% cor() %>% round(3) %>% corrplot()

# 엔진 크기와 실린더 갯수
plot(du_mtcars$cyl, du_mtcars$disp)
lm_mt <- lm(formula = disp ~ cyl, data = du_mtcars)

lm_mt %>% summary()

abline(lm_mt)


# (다)중선형 회귀 분석
# 여러개의 독립변수와 종속변수와의 관계를 분석하는 기법
# lm()
lm_mt2 <- lm(formula = mpg ~ cyl + disp + wt, data = du_mtcars)

lm_mt2 %>% summary()

# 백워드
# .은 모든을 의미한다.
lm_all <- lm(formula = mpg ~ ., data = du_mtcars)

lm_all %>% summary()

lm_backward <- step(lm_all, direction = 'backward')

lm_backward %>% summary()

# 로지스틱 회귀분석
# 미국 시험 성적 데이터
df_us <- read.csv('https://stats.idre.ucla.edu/stat/data/binary.csv')
df_us %>% str()

# 학습용 데이터
trainData <- df_us[1:300,]

# 테스트용 데이터
testData <- df_us[301:400,]

# glm(): 로지스틱 회귀분석을 수행하는 함수
# family: 'binomial' 이라는 값을 넘겨줘야 로지스틱 분석이 가능

# 컴퓨터에게 1~300번째 학생의 데이터로 학습을 시켜서 모델을 뽑는다.
glm_us <- glm(
  formula = admit ~ .,
  data = trainData,
  family = 'binomial'
)

glm_us %>% summary()

# predict(모형, newdata = 예측데이터, type = 'response'): 모형 검증 함수

# type을 response로 지정하면 0~1사이의 값을 알려준다.
predictRes <- predict(glm_us, newdata = testData, type='response') %>% round(0)

predictRes %>% table()
testData$admit %>% table()
table(predictRes, testData$admit)

# 68/100 예측 정확도를 보인다.
# 데이터가 많아지면 높은 성공률을 보인다.

install.packages('survival')
library(survival)

colon %>% str()

# 학습용
trainColon <- colon[1:1700,]

# 테스트용
testColon <- colon[1701:1858,]

glm_colon <- glm(formula = status ~ ., data = trainColon, family = 'binomial')

glm_colon <- step(glm_colon, direction = 'backward')

pred_colon <- predict(glm_colon, newdata = testColon, type = 'response') %>% round(0)
(pred_colon == testColon$status) %>% table()

# 다항 로지스틱 분석
iris %>% head()
iris %>% View()
# Species: 붓꽃의 종, Sepal: 꽃받침, Petal: 꽃잎

du_iris <- iris
trainData <- du_iris[1:30,] %>% rbind(du_iris[51:80,]) %>% rbind(du_iris[101:130,])
testData <- du_iris[31:50,] %>% rbind(du_iris[81:100,]) %>% rbind(du_iris[131:150,])

library(nnet) # multinom() -> 다항 로지스틱 회귀분석을 수행하는 함수(nnet 패키지에 존재한다.)

model_iris <- multinom(Species ~ ., data = trainData)
res <- predict(model_iris, newdata = testData)
(testData$Species == res) %>% table()
