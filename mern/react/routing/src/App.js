import logo from './logo.svg';
import './App.css';
import Home from './component/Home';
import TheIs from './component/TheIs';
import TheIsAd from './component/TheIsAdd';

import {
  Link,
  Routes,
  Route
} from "react-router-dom";
function App() {
  return (
    <div className="App">
      <Routes>
      <Route path="/:str" element={<TheIs/>}/>
      <Route path="/:str/:col1/:col2" element={<TheIsAd/>}/>
      
        <Route path="/home" element={<Home />} />
      </Routes>
    </div>
  );
}

export default App;
