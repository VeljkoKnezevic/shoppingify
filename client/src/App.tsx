import "./App.css";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Items from "./pages/Items";
import History from "./pages/History";

function App() {
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
