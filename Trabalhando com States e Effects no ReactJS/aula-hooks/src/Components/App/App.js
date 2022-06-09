import logo from './logo.svg';
import './App.css';
import Counter from '../Counter/Counter';
import SmartCounter from '../Counter/SmartCounter/SmartCounter';
import IfoodCounter from '../Counter/IfoodCounter/IfoodCounter';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <IfoodCounter/>
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
