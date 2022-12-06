import logo from './logo.svg';
import './App.css';
import PersonCard from './components/PersonCard';
function App() {
  return (
    <div className="App">
      <PersonCard firstName="laith" lastName="barq" age={22} color={"red"}/>
      <PersonCard firstName="thabet" lastName="toma" age={22} color={"black"}/>
      <PersonCard firstName="raad" lastName="toma" age={22} color={"yallow"}/>
      <PersonCard firstName="laith" lastName="barq" age={22} color={"red"}/>
    </div>
  );
}

export default App;
