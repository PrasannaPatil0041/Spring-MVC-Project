<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Feedback Page</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 40px;
      background: #f9f9f9;
    }

    h1 {
      text-align: center;
      color: #333;
    }

    .feedback-form {
      max-width: 500px;
      margin: auto;
      background: #fff;
      padding: 25px;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    label {
      font-weight: bold;
      display: block;
      margin-top: 15px;
    }

    textarea, select {
      width: 100%;
      padding: 10px;
      margin-top: 5px;
      border-radius: 5px;
      border: 1px solid #ccc;
      resize: vertical;
    }

    button {
      margin-top: 20px;
      padding: 10px 20px;
      border: none;
      background: #28a745;
      color: white;
      border-radius: 5px;
      cursor: pointer;
    }

    .datetime {
      text-align: center;
      margin-top: 30px;
      color: #555;
      font-style: italic;
    }

    /* Modal Styles */
    .modal {
      display: none;
      position: fixed;
      top: 0;
      left: 0;
      width: 100%;
      height: 100%;
      background-color: rgba(0,0,0,0.5);
      justify-content: center;
      align-items: center;
      z-index: 9999;
    }

    .modal-content {
      background: #fff;
      padding: 30px;
      border-radius: 10px;
      text-align: center;
      box-shadow: 0 5px 15px rgba(0,0,0,0.3);
    }

    .modal-content button {
      background: #007bff;
      margin-top: 20px;
    }
  </style>
</head>
<body>

  <%String name= (String)request.getAttribute("name");%>
  <h1>Feedback Page - <%=name%></h1>

  <div class="feedback-form">
    <form id="feedbackForm">
      <label for="feedback">Your Feedback:</label>
      <textarea id="feedback" name="feedback" rows="5" placeholder="Enter your feedback here..." required></textarea>

      <label for="rating">Rate our website (1 to 5):</label>
      <select id="rating" name="rating" required>
        <option value="">-- Select --</option>
        <option value="1">1 - Poor</option>
        <option value="2">2</option>
        <option value="3">3 - Average</option>
        <option value="4">4</option>
        <option value="5">5 - Excellent</option>
      </select>

      <button type="submit">Submit Feedback</button>
    </form>
  </div>

  <div class="datetime" id="datetime"></div>

  <!-- Modal -->
  <div class="modal" id="thankYouModal">
    <div class="modal-content">
      <h2>Thank you for your feedback!</h2>
      <p>We appreciate your time and input.</p>
      <button onclick="refreshPage()">OK</button>
    </div>
  </div>

  <script>
    // Display current date and time
    function updateDateTime() {
      const now = new Date();
      const formatted = now.toLocaleString();
      document.getElementById("datetime").textContent = "Submitted on: " + formatted;
    }
    updateDateTime();

    // Handle form submission
    document.getElementById("feedbackForm").addEventListener("submit", function(event) {
      event.preventDefault(); // prevent page reload
      document.getElementById("thankYouModal").style.display = "flex"; // show modal
    });

    function refreshPage() {
      location.reload();
    }
  </script>

</body>
</html>
