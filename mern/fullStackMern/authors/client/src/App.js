import logo from './logo.svg';
import './App.css';
import Main from './views/Main';
import { Router } from '@reach/router';
import Add from './views/Add';
import Update from './views/Update';

function App() {
  return (
    <div className="App">
       <h1>Favorite Author</h1>
      <Router>
      <Main path="/"/>
      <Add path="/new"/>
      <Update path="/edit/:id"/>
     

      </Router>
    </div>
  );
}

export default App;
