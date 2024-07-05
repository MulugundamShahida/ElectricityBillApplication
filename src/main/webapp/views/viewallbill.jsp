<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
<h1>Display ELECTRICITY  Details</h1>   
<table border="2" width="70%" cellpadding="2">   
<tr> 
    <th>CONSUMERId</th> 
    <th>CONSUMERName</th> 
    <th>CURRENTREADING</th> 
    <th>PREVIOUSREADING</th> 
     <th>UNITS</th> 
      <th>TOTALBILL</th>  
      <th>EDIT</th> 
      <th>DELETE</th> 
    </tr> 
   <c:forEach var="electricity" items="${electricity}">    
   <tr>   
   <td>${electricity.consumerid}</td>   
   <td>${electricity.consumername}</td>  
   <td>${electricity.currentreading}</td>    
   <td>${electricity.previousreading}</td>   
   <td>${electricity.units}</td>  
   <td>${electricity.totalbill}</td>  
    
  <td><a href="/editUrl/${electricity.consumerid}">Edit</a></td> 
  <td><a href="/deleteUrl/${electricity.consumerid}">Delete</a></td> 
   
    </tr>   
   </c:forEach>   
   </table>   
  