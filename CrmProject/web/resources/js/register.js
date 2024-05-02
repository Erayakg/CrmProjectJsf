$(document).ready(function() {
    // Ülkeleri yükleme
    $.getJSON('https://restcountries.com/v3.1/all', function(data) {
        data.forEach(function(country) {
            $('#country').append($('<option>', {
                value: country.cca3,
                text: country.name.common
            }));
        });
    });

    // Ülke seçildiğinde şehirleri yükleme
    $('#country').change(function() {
        var countryCode = $(this).val();
        $('#city').empty(); // Şehir listesini temizle

        // Replace with your actual RapidAPI key
        var apiKey = "your-rapidapi-key";
        var axios = require('axios');
        var config = {
          method: 'get',
          url: 'https://cities-api.p.rapidapi.com/v1/cities?country=' + countryCode,
          headers: {
            'x-rapidapi-key': apiKey,
            'x-rapidapi-host': 'cities-api.p.rapidapi.com'
          }
        };

        axios(config)
          .then(function (response) {
            var cities = response.data.cities;
            cities.forEach(function(city) {
                $('#city').append($('<option>', {
                    value: city.code,
                    text: city.name
                }));
            });
            console.log(cities);
          })
          .catch(function (error) {
            console.error(error);
          });
    });
    
});

