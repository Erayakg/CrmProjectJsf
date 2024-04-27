/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */


const mobileMenu = document.getElementById('mobile-menu');
const navLinks = document.querySelector('.nav-links');

window.onload = function() {
    var mobileMenu = document.getElementById('mobile-menu');
    var navLinks = document.querySelector('.nav-links');

    mobileMenu.addEventListener('click', function() {
        // Menü açık mı kapalı mı kontrol et
        var isVisible = navLinks.style.display === 'block';

        // Menüyü göster veya gizle
        if (isVisible) {
            navLinks.style.display = 'none';
        } else {
            navLinks.style.display = 'block';
        }

        // Mobil menü çubuklarının animasyonu
        this.classList.toggle('change');
    });
};

