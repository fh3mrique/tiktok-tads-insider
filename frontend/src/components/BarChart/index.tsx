import Chart from "react-apexcharts"

const BarCharts = () => {

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };

    const mockData = {
        labels: {
            categories: ['Vscode', 'Intellij', 'Eclipse', 'Netbeans', 'Pycharm']
        },
        series: [
            {
                data: [43.6, 67.1, 67.7, 45.6, 71.1]                   
            }
        ]
    };


  return (
    <Chart 
        options={{ ...options, xaxis: mockData.labels}}
        series={mockData.series}
        type="bar"
        height="300"

    />
  )
}

export default BarCharts