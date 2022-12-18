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


# 결과가 0이면 정상적으로 사용 가능
rJava::.jinit()

# 의존성 패키지 설치(KoNLP를 사용하는데에 필요한 패키지)
install.packages(c("hash", "tau", "Sejong", "RSQLite", "devtools", "bit", "rex", "lazyeval", "htmlwidgets", "crosstalk", "promises", "later", "sessioninfo", "xopen", "bit64", "blob", "DBI", "memoise", "plogr", "covr", "DT", "rcmdcheck", "rversions"), type = "binary")

# github 원격 패키지
install.packages("remotes")

# github에서 KoNLP 설치
remotes::install_github('haven-jeon/KoNLP', upgrade = "never", INSTALL_opts = c("--no-multiarch"))

.libPaths()

library(KoNLP)

# 설치 후 확인하기
extractNoun("R은 왜 패키지를 이렇게 설치해야 하는가?")

# 우리나라 단어가 저장된 사전을 설정(니아사전)
# ALL로 설치하기
useNIADic()

# 데이터 읽어오기
v_movie <- readLines('C:/Users/user/Desktop/R/movie.txt')

v_movie
