import logo from './logo.svg';
import './App.css';
import { Router } from '@reach/router' ;
import Luki from './component/Luki';
import Home from './component/Home';
import Err from './component/Err';

function App() {

  return (
    <div className="App">
      <Home/>
     <Router>
    
     <Luki path="/:search/:id"  />
     <Err path="/error"/>
     </Router>
    </div>
  );
}

export default App;
