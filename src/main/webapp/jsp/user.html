<div class="insideList" >
			
</div>
<script>
    //分页		
    function tiaozhuan(xuHao,typeid){
        var currentPage=null;
        var getTotalPage=null;
         currentPage=$('#cpage').text();
         getTotalPage=$('#tpage').text();
          switch(xuHao)  
          {   
          case 0: if(currentPage!=1){   
              currentPage=1;
              //      $('#cpage').text(currentPage);
              }else{ 
                  alert("已是首页！");   
                  };   
                  break;   
          case 1:if(currentPage>1){
              currentPage--;
              //  $('#cpage').text(currentPage);
              }else{
                  alert("已是首页！");
                  };             
                  break;
           case 2:if(parseInt(currentPage)<parseInt(getTotalPage)){
               currentPage++;
               // $('#cpage').text(currentPage);
               }else{
                   alert("已是尾页！");
                   };
                   break;
           case 3:if(currentPage!=getTotalPage){
               currentPage=getTotalPage
               // $('#cpage').text(currentPage);
               }else{
                   alert("已是尾页！");
                   };
                   break;
           case 4: if($('#tiaoPage').val()>getTotalPage){
                      alert("没有该页！！！");
                      }else{
                currentPage=$('#tiaoPage').val();
                $('#cpage').val(currentPage);};
                break;
            }
        var num=$('#num').val();
        if(num==''){num=0;}
        $.ajax({
        url:"wushuaxinfenye",
        type:"post",
        datatype:"json",
        data:{"typeid":typeid,
              "currentPage":currentPage},
        success:function(data){
        if(data !=null){
       $('#tpage').text(data.totalPage);
       $('#cpage').text(data.currentPage);
       var arr=data.tlist;
               $('.insideList').html("");//清空数据
           for(var i=0;i<data.tlist.length;i++){
                var time=new Date(arr[i].infortime).toLocaleString()
                 $('.insideList').append("<ul class='leftList'>"
                            +"<li>"
                        +"<div class='photo'>"+"<a href='selectInforDtl?inforid="+arr[i].inforid+"'>"+'查看详情'+"</a>"+"<img src='statics/uploadfiles/"+arr[i].backpic+"' alt='' width='240' height='140'/>"+"</div>"
                        +"<dl>"
                            +"<dt>"
                                +"<a href='selectInforDtl?inforid="+arr[i].inforid+"' class='f-20 c-main'>"+arr[i].title+"</a>"
                                +"<p class='f-18 c-999'>"+"<span class='c-999 mr-20'>"+arr[i].name+"</span>"+'|'+"<span class='c-999 ml-20'>"+time+"</span>"+"</p>"
                            +"</dt>"
                            +"<dd class='mt-10 f-14'>"
                                +"<p class='c-999' style=' -webkit-box-orient: vertical;-webkit-line-clamp: 2;overflow : hidden;display: -webkit-box;text-overflow: ellipsis;'>"+arr[i].context+"</p>"
                            +"</dd>"
                        +"</dl>"
                    +"</li>"
                    +"</ul>"
                );
            }
           
           $('.insideList').append("<div class='pageBox'>"
                    +"<ul class='page'>"
                    +"<li id='shouye_id'  onClick=tiaozhuan(0,"+typeid+")>"+"首页"+"</li>"
                    +"<li id='shangyiye_id'  onClick=tiaozhuan(1,"+typeid+")>"+"上一页"+"</li>"
                    +"<li>"+"<lable id='cpage'>"+data.currentPage+"</lable>"+"/"+"<lable id='tpage'>"+data.totalPage+"</lable>"+"</li>"
                    +"<li id='xiayiye_id'  onClick=tiaozhuan(2,"+typeid+")>"+"下一页"+"</li>"
                    +"<li id='weiye_id'   onClick=tiaozhuan(3,"+typeid+") >"+"尾页"+"</li>"
                    +"<li onClick=tiaozhuan(4,"+typeid+")>"+"跳转 &nbsp"+"<input type='text' id='tiaoPage' value='1'/>"+"</li>"
                    +"</ul>"
                    +"</div>");   			       
           
                             }else{alert("没有该页数据");
                    $('#cpage').val(1);
                  }
                  }
               
             });
        }
            
</script>