$(document).ready(function(){
	// $('#userBtn').attr('disabled', true);

	// $('#userForm').change(function(){
	// 	var usrName = $('#userName').val();
	// 	var usrPass = $('#userPass').val();

	// 	if(!usrName || !usrPass)
	// 	{
	// 		$('#userBtn').attr('disabled', true);
	// 	}
	// 	else
	// 	{
	// 		$('#userBtn').attr('disabled', false);
	// 	}
	// });	

	var form = $('form');
    form.submit(function(event)
	{
        var usrName = $('#userName').val();
        var usrPass = $('#userPass').val()
        $.ajax({
            type: form.attr('method'),
            url: form.attr('action'),
            data: 'userName=' + usrName + '&userPass=' + usrPass
        }).done(function(response) {
        	console.log(usrName);
        	$('#usrLogo').text(usrName);
			$('#usrLogo').removeClass('hidden');
	        $('#logo').addClass('hidden');
	        // $('#users').addClass('hidden');
            $('#usrLogo').html(usrName);
	        return false;
        }).fail(function() {
            console.log('Shit happened...');
            return false;
        });
        event.preventDefault();
    });

});