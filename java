document.addEventListener('DOMContentLoaded', () => {
    const hamburger = document.querySelector('.hamburger');
    const navMenu = document.querySelector('nav');

    if (hamburger && navMenu) {
        hamburger.addEventListener('click', () => {
            hamburger.classList.toggle('open');
            navMenu.classList.toggle('open');
        });

        navMenu.querySelectorAll('a').forEach(link => {
            link.addEventListener('click', () => {
                hamburger.classList.remove('open');
                navMenu.classList.remove('open');
            });
        });
    }

    // Placeholder for future interactive elements
    console.log('OTAS script loaded.');

    // Example of a simple interactive feature (not actual financial analysis)
    const metricValues = document.querySelectorAll('.metric-value');
    metricValues.forEach(metric => {
        metric.addEventListener('click', () => {
            alert(`You clicked on: ${metric.textContent}`);
            // In a real application, this could trigger more detailed data display
        });
    });
});
