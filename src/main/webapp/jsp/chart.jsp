<%@page import="com.te.model.Old"%>
<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        
<html>

<%@ include file="include.jsp"%>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>老人实时健康数据监测</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="dist/css/adminlte.min.css">
    <!-- Google Font: Source Sans Pro -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
    <script src="../js/highchart.js"></script>
</head>

<body class="hold-transition sidebar-mini">
    <div class="wrapper">
        <div id="container" style="min-width:400px;height:400px"></div>
        <div id="container1" style="min-width:400px;height:400px"></div>
    </div>
    <!-- ./wrapper -->

    <!-- jQuery -->
    <script src="plugins/jquery/jquery.min.js"></script>
    <!-- Bootstrap 4 -->
    <script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- Slimscroll -->
    <script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>
    <!-- FastClick -->
    <script src="plugins/fastclick/fastclick.js"></script>
    <!-- AdminLTE App -->
    <script src="dist/js/adminlte.min.js"></script>
    <!-- AdminLTE for demo purposes -->
    <script src="dist/js/demo.js"></script>
    <script>
        function chart1() {
            Highcharts.setOptions({
                global: {
                    useUTC: false
                }
            });
            function activeLastPointToolip(chart) {
                var points = chart.series[0].points;
                chart.tooltip.refresh(points[points.length - 1]);
            }
            var chart = Highcharts.chart('container', {
                chart: {
                    type: 'spline',
                    marginRight: 10,
                    events: {
                        load: function () {
                            var series = this.series[0],
                                series2 = this.series[1],
                                chart = this;
                            activeLastPointToolip(chart);
                            setInterval(function () {
                                var x = (new Date()).getTime(), // 当前时间
                                    y = Math.random() * 1000 % 50 + 50         // 随机值
                                //  var y2=Math.random()*1000%50+50
                                series.addPoint([x, y], true, true);
                                //  series2.addPoint([x,y2],true,true)
                                activeLastPointToolip(chart);
                            }, 1000);
                        }
                    }

                },
                title: {
                    text: '实时心率检测'
                },
                xAxis: {
                    type: 'datetime',
                    tickPixelInterval: 150
                },
                yAxis: {
                    title: {
                        text: null
                    }
                },
                tooltip: {
                    formatter: function () {
                        return '<b>' + this.series.name + '</b><br/>' +
                            Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) + '<br/>' +
                            Highcharts.numberFormat(this.y, 2);
                    }
                },
                legend: {
                    enabled: false
                },
                series: [{
                    name: '心率',
                    data: (function () {
                        // 生成随机值
                        var data = [],
                            time = (new Date()).getTime(),
                            i;
                        for (i = -19; i <= 0; i += 1) {
                            data.push({
                                x: time + i * 1000,
                                y: Math.random() * 1000 % 50 + 50

                            });
                        }
                        return data;
                    }())
                },
                    // {
                    // 		name: '随机数据',
                    // 		data: (function () {
                    // 				// 生成随机值
                    // 				var data = [],
                    // 						time = (new Date()).getTime(),
                    // 						i;
                    // 				for (i = -19; i <= 0; i += 1) {
                    // 						data.push({
                    // 								x: time + i * 1000,
                    // 								y: Math.random()*1000%50+50
                    // 						});
                    // 				}
                    // 				return data;
                    // 		}())
                    // }
                ]
            });
        }
        function chart2() {
            Highcharts.setOptions({
                global: {
                    useUTC: false
                }
            });
            function activeLastPointToolip(chart) {
                var points = chart.series[0].points;
                chart.tooltip.refresh(points[points.length - 1]);
            }
            var chart = Highcharts.chart('container1', {
                chart: {
                    type: 'spline',
                    marginRight: 10,
                    events: {
                        load: function () {
                            var series = this.series[0],
                                series2 = this.series[1],
                                chart = this;
                            activeLastPointToolip(chart);
                            setInterval(function () {
                                var x = (new Date()).getTime(), // 当前时间
                                    y = Math.random() * 1000 % 50 + 90         // 随机值
                                  var y2=Math.random()*1000%30+60
                                series.addPoint([x, y], true, true);
                                series2.addPoint([x,y2],true,true)
                                activeLastPointToolip(chart);
                            }, 1000);
                        }
                    }

                },
                title: {
                    text: '实时血压检测'
                },
                xAxis: {
                    type: 'datetime',
                    tickPixelInterval: 150
                },
                yAxis: {
                    title: {
                        text: null
                    }
                },
                tooltip: {
                    formatter: function () {
                        return '<b>' + this.series.name + '</b><br/>' +
                            Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) + '<br/>' +
                            Highcharts.numberFormat(this.y, 2);
                    }
                },
                legend: {
                    enabled: false
                },
                series: [{
                    name: '高压',
                    data: (function () {
                        // 生成随机值
                        var data = [],
                            time = (new Date()).getTime(),
                            i;
                        for (i = -19; i <= 0; i += 1) {
                            data.push({
                                x: time + i * 1000,
                                y: Math.random() * 1000 % 50 + 90    

                            });
                        }
                        return data;
                    }())
                },
                    {
                    		name: '低压',
                    		data: (function () {
                    				// 生成随机值
                    				var data = [],
                    						time = (new Date()).getTime(),
                    						i;
                    				for (i = -19; i <= 0; i += 1) {
                    						data.push({
                    								x: time + i * 1000,
                    								y:Math.random()*1000%30+60
                    						});
                    				}
                    				return data;
                    		}())
                    }
                ]
            });
        }
    </script>
    <script>
        chart1();
        chart2();
    </script>    
</body>

</html>