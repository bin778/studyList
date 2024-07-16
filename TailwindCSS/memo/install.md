- Tailwind CSS는 JavaScript로 작성되어 npm 패키지로 배포된다.
- 따라서, Tailwind CSS를사용하려면 Node.js와 npm이 설치되어 있어야 한다.

## 1. Tailwind CSS 설치
- npm를 통해 Tailwind CSS를 설치한다.
- init 명령어를 통해 'tailwind.config.js' 설정파일을 생성한다.
```bash
npm install -D tailwindcss
npx tailwindcss init
```

## 2. 템플릿 경로 구성
- 모든 템플릿 파일의 경로를 파일에 추가해야 한다.

```javascript
// tailwind.config.js
/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{html,js}"],
  theme: {
    extend: {},
  },
  plugins: [],
}
```

## 3. CSS에 Tailwind 지침 추가
- Tailwind의 각 레이어에 대한 지침을 기본 CSS 파일에 추가한다.

```css
@tailwind base;
@tailwind components;
@tailwind utilities;
```

## 4. Tailwind CLI 빌드 프로세스 시작
- CLI 도구를 실행하여 템플릿 파일의 클래스를 스캔하고 CSS를 빌드한다.

```bash
npx tailwindcss -i ./src/input.css -o ./src/output.css --watch
```

## 5. HTML에서 Tailwind를 사용
- 컴파일된 CSS 파일을 에 추가하고 Tailwind의 유틸리티 클래스를 사용하여 콘텐츠의 스타일을 지정할 수 있다.

```html
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="./output.css" rel="stylesheet">
</head>
<body>
  <h1 class="text-3xl font-bold underline">
    Hello world!
  </h1>
</body>
</html>
```
