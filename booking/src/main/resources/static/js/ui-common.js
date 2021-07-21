// menu
$('.main_menu .btn_close, .sub_menu .btn_close').on('click',function (){
  $(this).parent().toggleClass('is_fold');
});

// option panel
$('.option_panel .btn_close').on('click',function (){
  $(this).parents('.option_panel').removeClass('is_active');
});

// modal
$('.layer_dimmed .btn_close').on('click',function (){
  $(this).parents('.layer_dimmed').removeClass('is_active');
});

// tab panel
$('.tab_panel .option_title').on('click',function (){
  $(this).parent('.tab_panel').toggleClass('is_fold');
});

// sub tab
$('.sub_tab_area .btn_tab').on('click',function (){
  $('.sub_tab_area .btn_tab').removeClass('active');
  $(this).addClass('active');
});

// pagination
$('.pagination .page').on('click',function (){
  $('.pagination .page').removeClass('active');
  $(this).addClass('active');
});

// datePicker
$( "#date_from" ).datepicker({
  showOn: "button",
  buttonImage: "img/icon_calendar.png",
  buttonImageOnly: true,
  buttonText: "날짜 선택",
  currentText: "Now",
  defaultDate: "0",
  changeMonth: true,
  changeYear: true,
  numberOfMonths: 1,
  onClose: function( selectedDate ) {
    $( "#date_to" ).datepicker( "option", "minDate", selectedDate );
  }
});
$( "#date_to" ).datepicker({
  showOn: "button",
  buttonImage: "img/icon_calendar.png",
  buttonImageOnly: true,
  buttonText: "날짜 선택",
  currentText: "Now",
  defaultDate: "0",
  changeMonth: true,
  changeYear: true,
  numberOfMonths: 1,
  onClose: function( selectedDate ) {
    $( "#date_from" ).datepicker( "option", "maxDate", selectedDate );
  }
});
