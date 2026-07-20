import React, { Component } from "react";

class Counter extends Component {

    constructor() {
        super();

        this.state = {
            count: 0
        };
    }

    increment = () => {
        this.setState({
            count: this.state.count + 1
        });
    }

    decrement = () => {
        this.setState({
            count: this.state.count - 1
        });
    }

    sayHello = () => {
        alert("Hello! This is a static message.");
    }

    handleIncrement = () => {
        this.increment();
        this.sayHello();
    }

    welcome = (msg) => {
        alert(msg);
    }

    onPress = (e) => {
        alert("I was clicked");
        console.log(e);
    }

    render() {

        return (

            <div>

                <h2>Counter Example</h2>

                <h3>Counter : {this.state.count}</h3>

                <button onClick={this.handleIncrement}>
                    Increment
                </button>

                <button onClick={this.decrement}>
                    Decrement
                </button>

                <br /><br />

                <button onClick={() => this.welcome("Welcome")}>
                    Say Welcome
                </button>

                <br /><br />

                <button onClick={this.onPress}>
                    OnPress
                </button>

            </div>

        );
    }
}

export default Counter;
