$(document).ready(function() {
    $("#courseDropdown").change(function() {
        var courseId = $(this).val();
        if (courseId !== "") {
            $.get("/courses/" + courseId + "/trainer", function(data) {
                $("#assignedTrainer").html(data);
                $("#assignedTrainerSection").show();
            });
        } else {
            $("#assignedTrainer").html("");
            $("#assignedTrainerSection").hide();
        }
    });
    $("#updateCourseBtn").click(function() {
        var courseId = $("#courseDropdown").val();
        var trainerId = $("#trainerDropdown").val();

        if (courseId !== "" && trainerId !== "") {
            $.ajax({
                type: "PUT",
                url: "/courses/" + courseId + "/trainer/" + trainerId,
                success: function() {
                    alert("Assigned trainer updated successfully!");
                },
                error: function() {
                    alert("Failed to update assigned trainer.");
                }
            });
        }
    });
});
