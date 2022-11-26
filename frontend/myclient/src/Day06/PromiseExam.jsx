const PromiseExam = {
    callback: () => {
        console.log("callback start!!!!");

        let count = 0;

        // callback 함수 시작후 1초 뒤에 시작하는 함수
        setTimeout(() => {
            count = count + 1;
            console.log("1초 후에 시작하는 함수!!! ====> count = " + count);

            // 첫번째 setTimeout() 함수 실행 후 1초 뒤에 시작
            setTimeout(() => {
                count = count + 1;

                console.log("1초 후에 시작하는 함수!!! ====> count = " + count);

                // 두번째 setTimeout() 함수 실행 후 1초 뒤에 시작
                 setTimeout(() => {
                    count = count + 1;

                    console.log("1초 후에 시작하는 함수!!! ====> count = " + count);
                }, 1000);
            }, 1000);
        }, 1000);

        console.log("callback end!!!!");
    }
}

module.export = PromiseExam;