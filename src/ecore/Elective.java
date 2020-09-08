/**
 */
package ecore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.Elective#getCourse <em>Course</em>}</li>
 *   <li>{@link ecore.Elective#getSemesterInStudyplan <em>Semester In Studyplan</em>}</li>
 *   <li>{@link ecore.Elective#getExamAttempts <em>Exam Attempts</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getElective()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='courseInStudyPlan'"
 * @generated
 */
public interface Elective extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see ecore.EcorePackage#getElective_Course()
	 * @model
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link ecore.Elective#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Semester In Studyplan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecore.SemesterInStudyplan#getElectives <em>Electives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester In Studyplan</em>' container reference.
	 * @see #setSemesterInStudyplan(SemesterInStudyplan)
	 * @see ecore.EcorePackage#getElective_SemesterInStudyplan()
	 * @see ecore.SemesterInStudyplan#getElectives
	 * @model opposite="electives" transient="false"
	 * @generated
	 */
	SemesterInStudyplan getSemesterInStudyplan();

	/**
	 * Sets the value of the '{@link ecore.Elective#getSemesterInStudyplan <em>Semester In Studyplan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester In Studyplan</em>' container reference.
	 * @see #getSemesterInStudyplan()
	 * @generated
	 */
	void setSemesterInStudyplan(SemesterInStudyplan value);

	/**
	 * Returns the value of the '<em><b>Exam Attempts</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.ExamAttempt}.
	 * It is bidirectional and its opposite is '{@link ecore.ExamAttempt#getElective <em>Elective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam Attempts</em>' containment reference list.
	 * @see ecore.EcorePackage#getElective_ExamAttempts()
	 * @see ecore.ExamAttempt#getElective
	 * @model opposite="elective" containment="true"
	 * @generated
	 */
	EList<ExamAttempt> getExamAttempts();

} // Elective
