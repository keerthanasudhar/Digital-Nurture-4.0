import React, { useState } from "react";
import CurrencyConverter from "./CurrencyConverter";

function App() {
  const [count, setCount] = useState(0);

  const handleIncrement = () => {
    increment();
    sayHello();
  };

  const increment = () => {
    setCount(prev => prev + 1);
  };

  const decrement = () => {
    setCount(prev => prev - 1);
  };

  const sayHello = () => {
    alert("Hello Member!");
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div style={{ padding: "20px" }}>
      <h2>{count}</h2>

      <button onClick={handleIncrement}>Increment</button>
      <button onClick={decrement}>Decrement</button>

      <div>
        <button onClick={() => sayWelcome("welcome")}>Say welcome</button>
      </div>

      <div>
        <button onClick={handleClick}>Click on me</button>
      </div>

      <CurrencyConverter />
    </div>
  );
}

export default App;
