library(dplyr)

df_scores %>% is.na()

df_scores$gender %>% is.na() %>% is.table()

# gender에서 M이면 남성, F면 여성, NA이면 무응답으로 수정하기
df_scores <- df_scores %>% mutate(
  gender = ifelse(
    is.na(gender), '무응답',
    ifelse(gender == 'M','남성','여성')

) %>% head()

df_scores %>% View()


# 정렬하는 함수
# arrange(데이터프레임, 칼럼명)
# 매개변수로 넘겨준 칼럼을 기준으로 정렬하는 함수
df_scores %>% arrange(avg) %>% View()

#기본은 오름차순 정렬 -> 내림차순을 하려면 desc() 함수를 사용한다.

df_scores %>% arrange(desc(avg)) %>% View()

# 여러개의 컬럼
# 우선 avg를 기준으로 내림차순을 하고, avg가 동일한 값이라면
# classNum을 기준으로 오름차순 정렬한다.

df_scores %>% arrange(desc(avg), classNum) %>% View()

df_scores %>% arrange(classNum, desc(avg)) %>% View()

# 데이터 섞기

# sample은 데이터를 무작위로 섞어 벡터를 반환한다.
sample(1:20)

# nrow()는 행의 수 반환
df_scores %>% nrow()
# 1부터 df_scores의 행의 수까지 섞어서 벡터를 반환
sample(1:nrow(df_scores)) 

df_scores[sample(1:nrow(df_scores)),] %>% View()

# 각 반의 선생님 정보를 담고 있는 df를 생성하기

df_teacher <- data.frame(
  classNum = c(1:8),
  teacher = c(
    '김철수',
    '홍길동',
    '엄숙해',
    '반하나',
    '김사과',
    '윤빛나',
    '고길동',
    '마이콜'
  )
)

df_teacher

# left_join()
# left_join()은 합치려는 테이블의 공통되는 컬럼명이 존재해야 한다.
# 공통되는 테이블의 컬럼을 기준으로 테이블을 합쳐준다.

left_join(df_scores, df_teacher, by='classNum') %>% View()

# 행 합치기
# bind_rows()
# 행 합치기는 컬럼의 수와 이름이 같아야 가능하다.

group_a <- data.frame(
  id = c(1:4),
  score = c(10,20,30,40)
)

group_b <- data.frame(
  id = c(5:8),
  score = c(50,60,70,80)
)

bind_rows(group_b, group_a) %>% arrange(id)

# 그룹화하기
# group_by()
df_scores %>% group_by(classNum) %>% View()

# summarise() : 그룹별로 데이터를 요약할 때 사용하는 함수
df_scores %>% group_by(classNum) %>% 
  summarise(class_avg = mean(avg)) %>% arrange(desc(class_avg)) %>% View()

# 학점별 학생수를 확인하기
df_scores %>% group_by(grade) %>% 
  summarise(count = n()) %>% View()

# 여러 칼럼으로 요약이 가능하다.
df_scores %>% group_by(classNum) %>% 
  summarise(
    class_kor = mean(kor),
    class_eng = mean(eng),
    class_math = mean(math),
    class_avg = mean(avg)
  ) %>% View()

# summarise()에서 사용가능한 함수
# sum(), mean(), min(), max()
# n() : 빈도(count)
# median() : 중앙값
# sd() : 표준편차
# 등등....


# Data Frame 형식 -> 알아보기 쉽게 정보를 표시한다.
class_scores <- df_scores %>% group_by(classNum) %>% 
  summarise(
    class_kor = mean(kor),
    class_eng = mean(eng),
    class_math = mean(math),
    class_avg = mean(avg)
) %>% View()

df_scores %>% head()

class_scores %>% head()


# 시각화
# 데이터 준비하기
tv_ad <- data.frame(
  tv = 1:5,
  revenue = c(150, 180, 210, 240, 280)
)

# 도화지 준비
# plot() : 기본적인 그래프를 그리는 함수
plot(
  x = tv_ad$tv,
  y = tv_ad$revenue,
  xlab = 'tv광고량',
  ylab = '매출',
  main = 'tv광고량 대비 매출액',
  pch = 5,
  col = '#800000',
  cex = 2
)
# 색상은 hex 코드표를 검색해서 사용 가능
# color()를 실행시키면 색상 옵션에 사용가능한 목록을 볼 수 있다.
colors()

plot(
  NULL,
  xlab = 'tv광고량',
  ylab = '매출',
  xlim = c(1,5),
  ylim = c(100,700)
)

points(x = tv_ad$tv, y = tv_ad$revenue, col = 'red')

sns_ad <- data.frame(
  sns = 1:5,
  revenue = c(100, 110, 120, 200, 300)
)

points(x = sns_ad$sns, y=sns_ad$revenue, col='blue')

# legend() 범례를 추가하는 함수
legend('topright',
  legend = c('TV','SNS'),
  col = c('red','blue'),
  pch = c(1,1)
)

# ggplot2 패키지 설치
install.packages('ggplot2')

# 패키지 부착
library(ggplot2)

# 데이터 입력
df_green <- read.csv('F:/1400_R_choilb/resource/sample2/seoul_green.csv')

df_happiness <- read.csv('F:/1400_R_choilb/resource/sample2/seoul_happiness.csv')

# 데이터 파악하기
df_green %>% str()
df_green %>% View()


df_happiness %>% View()

# 데이터 전처리

# df_green에서 필요한 데이터
# 2~4번 열, 이름 : area, total_count, total_area
# 1~3번 행은 필요 없음
# 마지막 2개 행도 필요 없음
df_green %>% names()

df_green <- df_green %>% select(2:4) %>% 
  rename('area' = '구분별.2.', 
         'total_count' = 'X2021',
         'total_area' = 'X2021.1'
  )

df_green <- df_green[-c(1:3, 29:30),]

df_green %>% View()

# df_happiness에서 필요한 데이터
# 2~3번 열, 이름 : area, total_happiness
# 1~28번 행은 필요 없음음

df_happiness %>% names()

df_happiness<- df_happiness %>% select(2:3) %>% rename(
  'area' = '구분별.2.',
  'total_happiness' = 'X2021'
)
df_happiness <- df_happiness[-(1:28),]

df_happiness %>% View()

# 테이블 합치기
df_data <- left_join(df_green, df_happiness, by = 'area')

df_data %>% View()


# 데이터 시각화
# x : 원인(독립변수)
# y : 결과(종속변수)

# ggplot() : 도화지
# geom_point() : 산점도 그래프
# aes() : aesthetic(미적인), 그래프의 외적인 요소를 설정할 수 있다.

# ggplot2 패키지의 함수에서는 어떤 도화지에 그래프를 그릴지 알려줘야 하는데 +를 사용한다.
ggplot(df_data,
       aes(x = total_area, y = total_happiness, color = 'red')
) + geom_point()

# 위의 방법은 도화지를 준비하면서 동시에 세팅을 하는 방식이다.
# 처음에는 난잡하게 보이므로 아래 방법을 추천한다.
# ggplot()으로 도화지 준비 -> geom_xxx()로 그래프 그리기

df_data %>% ggplot() +
  geom_point(
    mapping = aes(
      x = total_count,
      y = total_happiness,
      color = 'red'
    )
  )

# xlim() : x축 범위
# ylim() : y축 범위

df_data %>% ggplot() +
  xlim(200,600) +
  geom_point(
    mapping = aes(
      x = total_count,
      y = total_happiness,
      color = 'red'
    )
  )
df_data %>% str()

# 컬럼이 문자 타입이라 xlim()이 적용이 안됨
# 숫자 타입으로 변경하고 다시 실행시키자!
df_data$total_count <- as.numeric(df_data$total_count)
df_data$total_area <- as.numeric(df_data$total_area)
df_data$total_happiness <- as.numeric(df_data$total_happiness)


# 선형 그래프도 추가하기
df_data %>% ggplot() +
  xlim(200,600) +
  geom_point(
    mapping = aes(
      x = total_count,
      y = total_happiness,
      color = 'red'
    )
  ) +
  geom_smooth(
    mapping = aes(
      x = total_count,
      y = total_happiness,
      color = 'green'
    )
  )


# ggplot()함수에서 x, y설정하면 같은 데이터로 그래프 처리가 가능
df_data %>% ggplot(
  aes(
    x = total_count,
    y = total_happiness
  )
) +
  xlim(200,600) +
  geom_point(color = 'red') +
  geom_smooth(color = 'green')

# 하나의 칼럼을 기준으로 색을 다르게 지정할 수 있다.
# 예를 들어 df_data에서 지역별로 색상을 지정할 수 있다.
df_data %>% ggplot() +
  xlim(200, 600) + 
  geom_point(
    mapping = aes(
      x = total_count,
      y = total_happiness,
      color = area
    )
  )

# 막대 그래프
df_scores

class_scores %>% ggplot() +
  geom_col(
    aes(
      x = classNum,
      y = class_avg
    )
  )

cars %>% str() # R 기본 내장데이터

cars %>% ggplot() +
  geom_col(aes(x=speed, y=dist))

# geom_bar() : x축만 설정한다.
# y축은 빈도수 나타낸다.
cars %>% ggplot() +
  geom_bar(aes(x=speed))

# df_scroes의 classNum을 geom_bar()로 그리면 반 별 학생수가 나온다.

df_scores %>% ggplot() +
  geom_bar(
    aes(x = classNum, fill = gender)
  )

df_scores %>% ggplot() +
  geom_bar(
    aes(x = classNum, y = kor), stat='identify'
  )

# stat 옵션의 기본값은 빈도를 세는 count
# stat 옵션을 identify로 변경하면 x값에 해당하는 y값을 지정하여 그릴 수 있다.

# stat은 '통계적'의 줄임말이다.
# bar()와 col()의 차이는 통계적으로 변한 유무의 차이
# col() 내가 원하는 x, y를 지정한다.
# bar() x만 지정해서 y는 통계적 변수로 알아서 변환한다.
# position 옵션을 활용하면 gender별 막대 그래프를 나눠줄 수 있다.
# 단, fill같은 옵션을 이용하여 그래프를 나눌 수 있는 기준을 만들어야 한다.
df_scores %>% ggplot() +
  geom_bar(
    aes(x = classNum, y = kor, fill = gender), stat='identity', position = 'dodge'
  )

# position옵션에 fill을 넣으면 데이터를 비율로 확인 가능
df_scores %>% ggplot() +
  geom_bar(
    aes(x = classNum, y = kor, fill = gender), stat='identity', position = 'fill'
  )

f <- ggplot(mpg, aes(class, hwy))
f + geom_col()
f + geom_violin(scale = "area")

mpg %>% head()
d <- ggplot(mpg, aes(cyl))

r <- d + geom_bar()
r + coord_polar(theta = "x", direction = 1)

ggplot(mpg, aes(y = cyl)) + geom_bar()



# x대신 y를 넘기면 가로 막대
df_scores %>% ggplot() +
  geom_bar(
    aes(y=classNum, fill = gender)
  )

df_scores %>% ggplot() +
  geom_bar(
    aes(y=classNum, fill = gender)
  ) + coord_flip() # 가로 막대로 변경하는 함수

df_scores %>% ggplot() +
  geom_bar(
    aes(y=classNum, fill = gender)
  ) + coord_flip(theta = x, direction = 1) # 원형

df_mosq <- read.csv('F:/1400_R_choilb/resource/sample2/seoul_mosquito.csv',encoding='UTF-8',fileEncoding = 'EUC-KR')

dev.off()

# 데이터 파악
df_mosq %>% str()

# 결측치 확인
df_mosq %>% is.na() %>% table()

# 이상치 확인
# 2016-05-01 아래에 1970-01-01이라는 이상치가 존재함
df_mosq %>% View()

# 데이터 전처리
df_mosq %>% names()

df_water <- df_mosq %>% rename(
  'date' = '모기지수.발생일',
  'water' = '모기지수.수변부.',
  'house' = '모기지수.주거지.',
  'park' = '모기지수.공원.',
) %>% select('date','water','house') %>% filter(date != '1970-01-01') %>% filter(!is.na(water))

df_water %>% is.na() %>% table()
df_water %>% ggplot() +
  geom_line(
    aes(x=date, y=water)
  )

# 날짜타입으로 바꾸기
# as.Date()
as.Date(df_water$date) %>% str()

df_water$date <- as.Date(df_water$date)

df_water %>% ggplot(aes(x=date))+geom_line(aes(y=water))+geom_line(aes(y=house))

df_water %>% str()


# 상자 그래프

df_scores %>% ggplot() +
  geom_boxplot(
    mapping = aes(
      group = classNum,
      x = classNum,
      y = kor
    )
  ) + coord_polar()

# 워드 클라우드
df_words <- data.frame(
  word = c('Java', 'C', 'Python', 'C++', 'R'),
  freq = c(15, 30, 5, 10, 7)
)

df_words %>% ggplot + geom_col(aes(x=word,y=freq))

# 워드 클라우드 시각화 패키지
install.packages('wordcloud')
library(wordcloud)

# wordcloud() : 함수
# words 옵션 : 단어를 넘겨준다.
# freq 옵션 : 빈도수를 넘겨준다.
# random.order : 순서를 랜덤하게 배치할 지,
# 큰 단어를 중앙에 배치할 지 결정하는 옵션

# scale : 크기와 동근 정도를 설정
brewer.pal.info # 파레트 정보

wordcloud(
  words = df_words$word,
  freq = df_words$freq,
  random.order = F,
  scale = c(10, 0.3)
)

# 파레트의 색과 이름을 보여줌
display.brewer.all()

# display.brewer.pal(n,name)
# 특정 파레트의 색을 원하는 수만큼 뽑아서 보여줌
display.brewer.pal(5,'Dark2')


brewer.pal(5,'Dark2') # 결과는 벡터

wordcloud(
  words = df_words$word,
  freq = df_words$freq,
  random.order = F,
  scale = c(10, 0.3),
  colors = brewer.pal(5, 'Dark2'),
  min.freq = 6, # 최소 6번 이상,
  max.words = 2, # 최대 2단어만 표시
  rot.per = .1 ) # 90도로 회전된 단어가 나올 확률 1 = 100%

install.packages('wordcloud2')
library(wordcloud2)

df_words %>% wordcloud2()

# 기본 제공되는 색상은
# random-light, random-dark가 있고, 파레트 사용 가능하다.

df_words %>% wordcloud2(
  backgroundColor = 'black',
  color = 'random-light'
)
