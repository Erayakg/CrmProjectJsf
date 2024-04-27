/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */


function toggleReplyForm(button) {
  var replyFormContainer = button.parentNode.querySelector('.reply-form-container');
  replyFormContainer.style.display = replyFormContainer.style.display === 'none' ? 'block' : 'none';
}