import CohortDetails from "./components/CohortDetails";

function App() {

  const cohorts = [

    {
      cohortCode: "INTADMDF10 - .NET FSD",
      startDate: "22-Feb-2022",
      currentStatus: "Scheduled",
      coach: "Aathma",
      trainer: "Jojo Jose"
    },

    {
      cohortCode: "ADM21JF014 - Java FSD",
      startDate: "10-Sep-2021",
      currentStatus: "Ongoing",
      coach: "Apoorv",
      trainer: "Elisa Smith"
    },

    {
      cohortCode: "CDBJF21025 - Java FSD",
      startDate: "24-Dec-2021",
      currentStatus: "Ongoing",
      coach: "Aathma",
      trainer: "John Doe"
    }

  ];

  return (

    <div>

      <h1>Cohorts Details</h1>

      {cohorts.map((item, index) => (

        <CohortDetails
          key={index}
          details={item}
        />

      ))}

    </div>

  );

}

export default App;
