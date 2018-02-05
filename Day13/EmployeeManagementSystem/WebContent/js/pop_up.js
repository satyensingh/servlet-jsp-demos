/**
 * 
 */
$(document).ready(function() {
	$(function() {
		$("#dialog").dialog({
			autoOpen : false
		});
		
		$(".edit").click(function(){
			$("#dialog").dialog("open");
			var empid = $(this).parent().parent().attr("class");
			$("#empId").val(empid);
		});
	});
});