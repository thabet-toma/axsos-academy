import logo from './logo.svg';
import './App.css';
import Taps from './comonent/Taps';
function App() {
  return (
    <div className="App">
     <Taps lists={["tap1","tap2"]}/>
    </div>
  );
}

export default App;
