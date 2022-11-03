import React from "react";

export default class Day03A5 extends React.Component {
    constructor(props) {
        super(props);

        this.state = { radio: 0 }
    }

    onChangeMac = (event) => {
        console.log("맥 " + event.target.checked);
    }

    onChangeWindow = (event) => {
        console.log("윈도우 " + event.target.checked);
    }

    onChangeUnix = (event) => {
        console.log("유닉스 " + event.target.checked);
    }

    // onChangeRadio = (type) => {
    //     console.log(type);
    // }

    onChangeRadio = (event) => {
        console.log(event.target.textContent);
    }

    render() {
        return <div>
            <h3>Radiobox onChange</h3>
            {/* <input type="radio" name="os" onChange={this.onChangeWindow}/>윈도우
            <input type="radio" name="os" onChange={this.onChangeMac}/>맥
            <input type="radio" name="os" onChange={this.onChangeUnix}/>유닉스 */}

            {/* <input type="radio" name="os" onChange={(event) => this.onChangeRadio('win')}/>윈도우
            <input type="radio" name="os" onChange={(event) => this.onChangeRadio('mac')}/>맥
            <input type="radio" name="os" onChange={(event) => this.onChangeRadio('unix')}/>유닉스 */}

            <input type="radio" name="OS" value='윈도우' onChange={this.onChangeRadio}/>윈도우
            <input type="radio" name="OS" value='맥' onChange={this.onChangeRadio}/>맥
            <input type="radio" name="OS" value='유닉스' onChange={this.onChangeRadio}/>유닉스
        </div>
    }
}