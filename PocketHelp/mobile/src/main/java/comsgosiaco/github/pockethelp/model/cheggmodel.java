package comsgosiaco.github.pockethelp.model;

import java.util.ArrayList;
import java.util.List;

public class cheggmodel {
    private Integer httpCode;
    private List<Object> errors = new ArrayList<Object>();
    private List<Result> result = new ArrayList<Result>();

    /**
     *
     * @return
     * The httpCode
     */
    public Integer getHttpCode() {
        return httpCode;
    }

    /**
     *
     * @param httpCode
     * The httpCode
     */
    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    /**
     *
     * @return
     * The errors
     */
    public List<Object> getErrors() {
        return errors;
    }

    /**
     *
     * @param errors
     * The errors
     */
    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    /**
     *
     * @return
     * The result
     */
    public List<Result> getResult() {
        return result;
    }

    /**
     *
     * @param result
     * The result
     */
    public void setResult(List<Result> result) {
        this.result = result;
    }
    public class Result {

        private String schoolName;

        private String schoolId;

        private SchoolBasic schoolBasic;

        /**
         *
         * @return
         * The schoolName
         */
        public String getSchoolName() {
            return schoolName;
        }

        /**
         *
         * @param schoolName
         * The schoolName
         */
        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }

        /**
         *
         * @return
         * The schoolId
         */
        public String getSchoolId() {
            return schoolId;
        }

        /**
         *
         * @param schoolId
         * The schoolId
         */
        public void setSchoolId(String schoolId) {
            this.schoolId = schoolId;
        }

        /**
         *
         * @return
         * The schoolBasic
         */
        public SchoolBasic getSchoolBasic() {
            return schoolBasic;
        }

        /**
         *
         * @param schoolBasic
         * The schoolBasic
         */
        public void setSchoolBasic(SchoolBasic schoolBasic) {
            this.schoolBasic = schoolBasic;
        }

    }
    public class SchoolBasic {

        private String ipedId;

        /**
         *
         * @return
         * The ipedId
         */
        public String getIpedId() {
            return ipedId;
        }

        /**
         *
         * @param ipedId
         * The ipedId
         */
        public void setIpedId(String ipedId) {
            this.ipedId = ipedId;
        }

    }
}
