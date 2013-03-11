<script language="JavaScript" type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script>
    $(document).ready(function(){
        $('#extendedStay').click(function(){
            $('#extendedFullTime').toggle(this.checked);
            $('#extendedPartTime').toggle(this.checked);
        });
    });
</script>