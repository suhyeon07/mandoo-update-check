/**
 * 
 */
 //오늘 할 일 출력

//todayArr[l]-7*parseInt(todayArr[l]/7)은 요일넘버
//(todayArr[l]-(todayArr[l]-7*parseInt(todayArr[l]/7)))/7+1은 칸번호


//우선순위 1
document.write("<br>1순위<br>");
   for(var l=0;l<count;l++)
   {
      if(lank[(todayArr[l]-(todayArr[l]-7*parseInt(todayArr[l]/7)))/7+1]==1)
      {
         var printListContents = contents[(todayArr[l]-(todayArr[l]-7*parseInt(todayArr[l]/7)))/7+1];
         checkboxplus = document.createElement("input");
         checkboxplus.type="checkbox";
         checkboxplus.name="finished";
         checkboxplus.value=printListContents;
         document.getElementById("ToDoList").appendChild(checkboxplus);
         document.write('&nbsp'+'<span class="lank1List">'+printListContents+'</span>');
         document.write('<br>');
      }
   }

//우선순위 2
document.write("<br>2순위<br>");
   for(var l=0;l<count;l++)
   {
      if(lank[(todayArr[l]-(todayArr[l]-7*parseInt(todayArr[l]/7)))/7+1]==2)
      {
         var printListContents = contents[(todayArr[l]-(todayArr[l]-7*parseInt(todayArr[l]/7)))/7+1];
         checkboxplus = document.createElement("input");
         checkboxplus.type="checkbox";
         checkboxplus.name="finished";
         checkboxplus.value=printListContents;
         document.getElementById("ToDoList").appendChild(checkboxplus);
         document.write('&nbsp'+'<span class="lank2List">'+printListContents+'</span>');
         document.write('<br>');
      }
   }
   
   //우선순위 3
document.write("<br>3순위<br>");
   for(var l=0;l<count;l++)
   {
      if(lank[(todayArr[l]-(todayArr[l]-7*parseInt(todayArr[l]/7)))/7+1]==3)
      {
         var printListContents = contents[(todayArr[l]-(todayArr[l]-7*parseInt(todayArr[l]/7)))/7+1];
         checkboxplus = document.createElement("input");
         checkboxplus.type="checkbox";
         checkboxplus.name="finished";
         checkboxplus.value=printListContents;
         document.getElementById("ToDoList").appendChild(checkboxplus);
         document.write('&nbsp'+'<span class="lank3List">'+printListContents+'</span>');
         document.write('<br>');
      }
   }
   
   //우선순위 4
document.write("<br>4순위<br>");
   for(var l=0;l<count;l++)
   {
      if(lank[(todayArr[l]-(todayArr[l]-7*parseInt(todayArr[l]/7)))/7+1]==4)
      {
         var printListContents = contents[(todayArr[l]-(todayArr[l]-7*parseInt(todayArr[l]/7)))/7+1];
         checkboxplus = document.createElement("input");
         checkboxplus.type="checkbox";
         checkboxplus.name="finished";
         checkboxplus.value=printListContents;
         document.getElementById("ToDoList").appendChild(checkboxplus);
         document.write('&nbsp'+'<span class="lank4List">'+printListContents+'</span>');
         document.write('<br>');
      }
   }
   
   //우선순위 5
document.write("<br>5순위<br>");
   for(var l=0;l<count;l++)
   {
      if(lank[(todayArr[l]-(todayArr[l]-7*parseInt(todayArr[l]/7)))/7+1]==5)
      {
         var printListContents = contents[(todayArr[l]-(todayArr[l]-7*parseInt(todayArr[l]/7)))/7+1];
         checkboxplus = document.createElement("input");
         checkboxplus.type="checkbox";
         checkboxplus.name="finished";
         checkboxplus.value=printListContents;
         document.getElementById("ToDoList").appendChild(checkboxplus);
         document.write('&nbsp'+'<span class="lank5List">'+printListContents+'</span>');
         document.write('<br>');
      }
   }