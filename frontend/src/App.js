import logo from './logo.svg';
import './App.css';
import {useEffect, useState} from "react";

function App() {

  const [data,setData] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      try{
        const response = await axios.get('http://localhost:8080/api/users');
        setData(response.data);
      }catch (error) {
        console.log(error);
      }
    };
    fetchData();
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
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
