<%-- target is used for either bean or map only 
target should not be null
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="xy" class="attr.Emp"/>

<c:set target="${xy}"  property="name" value="anil"/>

the value is <br>
<jsp:getProperty name="xy" property="name"/>
<br>
${xy.name}
<br>
<b>for Map  </b>
<jsp:useBean id="ab" class="java.util.HashMap"/>
<c:set target="${ab}" property="one" value="31"/>
<c:set target="${ab}" property="two" value="true"/>
<br>
the value is
<br>
${ab.one}
<br>
${ab["two"]}