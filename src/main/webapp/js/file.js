$(document).ready(function(){
	 /*表单的确认按钮点击事件
     * 提交表单     */
    $('div i.fa-check').click(function(){
        if(check() == true)
    	   document.forms["fileAndSystemForm"].submit();
    });
    
});