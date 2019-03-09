/**
 * 放置一些公用的参数以及函数，以方便调用
 */

//变量模块


//函数模块
//字符串截断
function sub(target) {
    var returnStr = target;
    if (target.length > 15) {
        returnStr = target.substring(0, 15) + "...";
    }
    return returnStr;
}

// 获取form数据json
function serializeFormData(formid) {
    var result = {};
    var data = $(formid).serializeArray();
    for (var i = 0; i < data.length; i++) {
        result[data[i].name] = data[i].value;
    }
    return result;
}

function getDefaultDataTableOption() {
    var datTableInit = {
        "scrollX": true,
        "scrollY": document.documentElement.clientHeight - 170,
        "scrollCollapse": true,
        bAutoWidth: true,//for better responsiveness
        "ordering": false,
        "pageLength": 15,
        "processing": true,
        language: {
            url: 'datetables_cn.json'
        },
        serverSide: true,
        ajax: {
            url: globalConfig.baseUrlPath,
            type: 'POST'
        },
        "dom": 'tr<"row"<"col-xs-6"i><"col-xs-6"p>>',
        "columnDefs": [
            {
                "aTargets": [0], "mRender": function (data, type, full, meta) {
                    return meta.settings._iDisplayStart + meta.row + 1;
                }
            }
        ]
    };
    return datTableInit;
}


