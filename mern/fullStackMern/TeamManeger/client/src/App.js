import logo from './logo.svg';
import './App.css';
import Header from './component/Header';
import { Router } from '@reach/router';
import List from './views/List';
import AddPlayer from './views/AddPlayer';
import Status from './views/Status';



function App() {
  return (
    <div className="App">
      <Header/>
      <Router>
        <List path="/players/list"/>
        <AddPlayer path="/players/addPlayer"/>
        <Status path="status/game/:num"/>

      </Router>
    </div>
  );
}

export default App;
