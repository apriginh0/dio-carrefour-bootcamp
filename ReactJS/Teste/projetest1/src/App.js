import logo from './logo.svg';
import './App.css';
import Button from './Button';

function soma(a, b) {
  alert(a + b)
}

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Hello, hello, World!
        </p>
        <Button onClick= {( ) => soma(10, 20)} name="Diego Aprigio" />
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
