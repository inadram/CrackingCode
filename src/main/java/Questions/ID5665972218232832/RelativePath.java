package Questions.ID5665972218232832;

public class RelativePath {
    public String normalise(String path) {
        path = removeCurrentDirectorySign(path);
        return removeParentDirectorySign(path);
    }

    private String removeParentDirectorySign(String path) {
        String[] pathArray =path.split("\\\\.\\.");
        StringBuilder pathBuilder = new StringBuilder();
        for (String aPathArray : pathArray) {
            if (pathBuilder.length()>0) pathBuilder.delete(pathBuilder.lastIndexOf("\\"), pathBuilder.length());
            pathBuilder.append(aPathArray);
        }
        return pathBuilder.toString();
    }

    private String removeCurrentDirectorySign(String path) {
        return path.replace("\\.\\", "\\");
    }
}
