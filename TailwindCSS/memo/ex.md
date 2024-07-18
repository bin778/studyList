## 버튼을 스타일링하는 코드 예시
### 일반 CSS 예시
#### HTML
```HTML
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Button</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <button class="btn">클릭</button>
</body>
</html>
```

#### CSS (styles.css)
```CSS
.btn {
    background-color: #3490dc;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
    transition: background-color 0.3s;
}

.btn:hover {
    background-color: #2779bd;
}
```

#### 일반 CSS
* 스타일링을 위해 별도의 CSS 파일 (styles.css)을 작성해야 한다.
* 클래스 선택자를 이용해 스타일 규칙을 정의한다.
* HTML 파일에서는 class 속성을 이용해 스타일 클래스를 지정한다.

### Tailwind CSS 예시
#### HTML
```HTML
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Button</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body>
    <button class="bg-blue-500 text-white py-2 px-4 rounded hover:bg-blue-700 transition duration-300">클릭</button>
</body>
</html>
```

#### Tailwind CSS
* 별도의 CSS 파일 없이, Tailwind CSS의 유틸리티 클래스를 HTML 요소에 직접 적용한다.
* 스타일링을 위한 클래스가 HTML 요소에 인라인으로 적용되므로, 클래스 이름이 길어질 수 있다.
* Tailwind CSS의 유틸리티 클래스는 미리 정의된 스타일을 제공한다. 따라서 빠르게 스타일을 적용할 수 있지만, 모든 스타일을 Tailwind의 클래스 이름으로 표현해야 한다.

### 결론
* 일반 CSS는 스타일링의 유연성을 제공하는 반면, Tailwind CSS는 빠른 스타일링과 일관된 디자인을 쉽게 구현할 수 있도록 도와준다.
