// Financial Dashboard Chart
const ctx = document.getElementById('financialChart').getContext('2d');
const financialChart = new Chart(ctx, {
  type: 'line',
  data: {
    labels: ['January', 'February', 'March', 'April', 'May', 'June'],
    datasets: [{
      label: 'Revenue',
      data: [12000, 19000, 3000, 50000, 20000, 30000],
      borderWidth: 2,
      borderColor: '#007acc',
      fill: false
    }]
  },
  options: {
    responsive: true,
    plugins: {
      legend: {
        position: 'top',
      },
    },
  }
});

// Open Financial Calculator
function openCalculator() {
  alert('ROI Calculator Coming Soon!');
}
