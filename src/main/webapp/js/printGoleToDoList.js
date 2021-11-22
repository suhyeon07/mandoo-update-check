/**
 * 
 */
 //오늘 할 일 출력

//todayArr[l]-7*parseInt(todayArr[l]/7)은 요일넘버
//(todayArr[l]-(todayArr[l]-7*parseInt(todayArr[l]/7)))/7+1은 칸번호


var todayArr = new Array();

// 오늘 할 일 탐색
var d=new Date();
var today = d.getDay();
var count=0;

for(var num=1;num<=81;num++){
    if(dayArr[7*(num-1)+today]==1){
        todayArr[count]=7*(num-1)+today;//num는 칸번호, today는 요일
        count++
    }
}


//첫번쨰 중간목표
document.write("<br>"+contents[5]+"<br>");
   for(var num=1;num<10;num++)
   {
      if(dayArr[7*(num-1)+today]==1)
      {
         var printListContents = contents[num];
         checkboxplus = document.createElement("input");
         checkboxplus.type="checkbox";
         checkboxplus.name="finished";
         checkboxplus.value=printListContents;
         document.getElementById("ToDoList").appendChild(checkboxplus);
         document.write('&nbsp'+'<span id="lank1">'+printListContents+'</span>');
         document.write('<br>');
      }
   }


document.write("<br>"+contents[14]+"<br>");
   for(var num=10;num<19;num++)
   {
      if(dayArr[7*(num-1)+today]==1)
      {
         var printListContents = contents[num];
         checkboxplus = document.createElement("input");
         checkboxplus.type="checkbox";
         checkboxplus.name="finished";
         checkboxplus.value=printListContents;
         document.getElementById("ToDoList").appendChild(checkboxplus);
         document.write('&nbsp'+'<span id="lank1">'+printListContents+'</span>');
         document.write('<br>');
      }
   }


document.write("<br>"+contents[23]+"<br>");
   for(var num=19;num<28;num++)
   {
      if(dayArr[7*(num-1)+today]==1)
      {
         var printListContents = contents[num];
         checkboxplus = document.createElement("input");
         checkboxplus.type="checkbox";
         checkboxplus.name="finished";
         checkboxplus.value=printListContents;
         document.getElementById("ToDoList").appendChild(checkboxplus);
         document.write('&nbsp'+'<span id="lank1">'+printListContents+'</span>');
         document.write('<br>');
      }
   }



document.write("<br>"+contents[32]+"<br>");
   for(var num=28;num<37;num++)
   {
      if(dayArr[7*(num-1)+today]==1)
      {
         var printListContents = contents[num];
         checkboxplus = document.createElement("input");
         checkboxplus.type="checkbox";
         checkboxplus.name="finished";
         checkboxplus.value=printListContents;
         document.getElementById("ToDoList").appendChild(checkboxplus);
         document.write('&nbsp'+'<span id="lank1">'+printListContents+'</span>');
         document.write('<br>');
      }
   }




document.write("<br>"+contents[50]+"<br>");
   for(var num=46;num<55;num++)
   {
      if(dayArr[7*(num-1)+today]==1)
      {
         var printListContents = contents[num];
         checkboxplus = document.createElement("input");
         checkboxplus.type="checkbox";
         checkboxplus.name="finished";
         checkboxplus.value=printListContents;
         document.getElementById("ToDoList").appendChild(checkboxplus);
         document.write('&nbsp'+'<span id="lank1">'+printListContents+'</span>');
         document.write('<br>');
      }
   }


document.write("<br>"+contents[59]+"<br>");
   for(var num=55;num<64;num++)
   {
      if(dayArr[7*(num-1)+today]==1)
      {
         var printListContents = contents[num];
         checkboxplus = document.createElement("input");
         checkboxplus.type="checkbox";
         checkboxplus.name="finished";
         checkboxplus.value=printListContents;
         document.getElementById("ToDoList").appendChild(checkboxplus);
         document.write('&nbsp'+'<span id="lank1">'+printListContents+'</span>');
         document.write('<br>');
      }
   }


document.write("<br>"+contents[68]+"<br>");
   for(var num=64;num<73;num++)
   {
      if(dayArr[7*(num-1)+today]==1)
      {
         var printListContents = contents[num];
         checkboxplus = document.createElement("input");
         checkboxplus.type="checkbox";
         checkboxplus.name="finished";
         checkboxplus.value=printListContents;
         document.getElementById("ToDoList").appendChild(checkboxplus);
         document.write('&nbsp'+'<span id="lank1">'+printListContents+'</span>');
         document.write('<br>');
      }
   }



document.write("<br>"+contents[77]+"<br>");
   for(var num=73;num<82;num++)
   {
      if(dayArr[7*(num-1)+today]==1)
      {
         var printListContents = contents[num];
         checkboxplus = document.createElement("input");
         checkboxplus.type="checkbox";
         checkboxplus.name="finished";
         checkboxplus.value=printListContents;
         document.getElementById("ToDoList").appendChild(checkboxplus);
         document.write('&nbsp'+'<span id="lank1">'+printListContents+'</span>');
         document.write('<br>');
      }
   }