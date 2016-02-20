/**
 * 
 */

function Hello($scope, $http) {
    $http.get('posts/').
        success(function(data) {
            $scope.post = data;
        });
}