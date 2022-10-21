import React from "react";

export default class Day03A4 extends React.Component {
    constructor(props) {
        super(props);

        this.state = {text: this.props.text, check: true };
    }

    onChangeText = (event) => {
        console.log(event.target.value);
        console.log(this.state.text);
        this.setState({text: event.target.value});
    }

    onChangeCheck = (event) => {
        // console.log(event.target.value); => 체크박스는 이 값으로 읽지 않는다.
        console.log(event.target.checked);
    }

    render() {
        return <div>
            <div>
                <h3>Textbox onChange</h3>
                <input type="text" value={this.state.text} onChange={this.onChangeText} />
                <p>입력된 값은 {this.state.text}</p>
            </div>

            <div>
                <h3>Checkbox onChange</h3>
                <input type="checkbox" onChange={this.onChangeCheck} />
            </div>
        </div>
    }
}