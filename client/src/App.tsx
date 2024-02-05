import "./App.css";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Items from "./pages/Items";
import History from "./pages/History";
import { Table } from "./types";

function App() {
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  const queryFunction = async (table: Table): Promise<any> => {
    const response = await fetch(`http://localhost:8080/${table}/all`, {
      method: "GET",
    });
    const json = response.json();
    return json;
  };

  return (
    <Router>
      <Routes>
        <Route path="/" element={<Items />} />
        <Route path="/history" element={<History />} />
      </Routes>
    </Router>
  );
}

export default App;
