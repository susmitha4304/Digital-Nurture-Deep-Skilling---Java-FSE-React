import './App.css';
import officeImg from './images/office.jpg';

function App() {

  const heading = "Office Space";

  const office = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    },
    {
      Name: "Tech Park",
      Rent: 75000,
      Address: "Bangalore"
    },
    {
      Name: "WeWork",
      Rent: 65000,
      Address: "Hyderabad"
    },
    {
      Name: "Smart Office",
      Rent: 45000,
      Address: "Pune"
    }
  ];

  return (
    <div className="App">

      <h1>{heading}, at Affordable Range</h1>

      <img
        src={officeImg}
        alt="Office Space"
        width="350"
        height="220"
      />

      <h2>Single Office Details</h2>

      <h3>Name: {office.Name}</h3>

      <h3
        style={{
          color: office.Rent <= 60000 ? "red" : "green"
        }}
      >
        Rent: Rs. {office.Rent}
      </h3>

      <h3>Address: {office.Address}</h3>

      <hr />

      <h2>Office Space List</h2>

      {officeList.map((item, index) => (

        <div key={index} className="card">

          <h3>Name: {item.Name}</h3>

          <h3
            style={{
              color: item.Rent <= 60000 ? "red" : "green"
            }}
          >
            Rent: Rs. {item.Rent}
          </h3>

          <h3>Address: {item.Address}</h3>

          <hr />

        </div>

      ))}

    </div>
  );
}

export default App;
