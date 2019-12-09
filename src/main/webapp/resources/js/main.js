$(function () {
'use strict';
        var ticksStyle = {
        fontColor: '#495057',
                fontStyle: 'bold'
        };
        var mode = 'index';
        var intersect = true;
        var $salesChart = $("#salesChart").get(0).getContext("2d");
        var salesChart = new Chart($salesChart, {
        type: 'bar',
                data: {
                labels: #{prestationChiffreAffaireBean.labels},
                        datasets: [
                        {
                        label: '2019',
                                backgroundColor: '#007bff',
                                borderColor: '#007bff',
                                data: #{prestationChiffreAffaireBean.listMnt}
                        }/*,
                         {
                         label: '2018',
                         backgroundColor: '#808080',
                         borderColor: '#808080',
                         data: [1000, 2000, 3525, 2500, 2700, 700, 1700, 2700, 2000, 1800, 1500, 2000]
                         }*/
                        ]
                },
                options: {
                title: {
                display: true,
                        text: 'Chiffre d\'affaire'
                },
                        maintainAspectRatio: false,
                        tooltips: {
                        mode: mode,
                                intersect: intersect
                        },
                        hover: {
                        mode: mode,
                                intersect: intersect
                        },
                        legend: {
                        display: false,
                                position: 'bottom'
                        },
                        scales: {
                        yAxes: [{
                        // display: false,
                        gridLines: {
                        display: true,
                                lineWidth: '4px',
                                color: 'rgba(255, 255, 255, 1)',
                                zeroLineColor: 'rgba(255, 255, 255, 1)'
                        },
                                ticks: $.extend({
                                beginAtZero: true,
                                        // Include a dollar sign in the ticks
                                        callback: function (value, index, values) {
                                        if (value >= 1000) {
                                        value /= 1000;
                                                if (value >= 1000) {
                                        value /= 1000;
                                                if (value >= 1000) {
                                        value /= 1000;
                                                value += ' Milliard';
                                        } else {
                                        value += ' Million';
                                        }
                                        } else {
                                        value += ' Mille';
                                        }

                                        }
                                        return value;
                                        }
                                }, ticksStyle)
                        }],
                                xAxes: [{
                                display: true,
                                        gridLines: {
                                        display: true
                                        },
                                        ticks: ticksStyle
                                }]
                        }
                }
        });
});