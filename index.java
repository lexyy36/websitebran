// script.js

document.addEventListener('DOMContentLoaded', () => {
    const showContactButton = document.getElementById('showContact');
    const contactDiv = document.getElementById('contact');
    
    showContactButton.addEventListener('click', () => {
        if (contactDiv.style.display === 'none') {
            contactDiv.style.display = 'block';
            showContactButton.textContent = 'Sembunyikan Kontak';
        } else {
            contactDiv.style.display = 'none';
            showContactButton.textContent = 'Tampilkan Kontak';
        }
    });
});
